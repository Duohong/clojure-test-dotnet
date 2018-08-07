(assembly-load-from "Production.dll")
(assembly-load-from "stubCalculator.dll")

(ns clojure-test-dotnet.test
  (:require [clojure.test :refer :all]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]))


; test instance method
(deftest schoolBag-add
  (let [schoolBag (Production.SchoolBag. (stubCalculator.))]
    (is (= 4 (.Add schoolBag 2)))
    (is (= 9 (.Add schoolBag 3)))))

(schoolBag-add)


; test by gen
(deftest schoolBag-add-gen
  (let [schoolBag (Production.SchoolBag. (stubCalculator.))
        a (gen/sample (gen/choose -1000 1000) 1)]
    (is (= (* (first a) (first a)) (.Add schoolBag (first a))))))            

(schoolBag-add-gen)


; test by spec
(defspec schoolBag-add-spec 10
  (prop/for-all [a gen/int]
    (let [schoolBag (Production.SchoolBag. (stubCalculator.))]
      (println a)
      (is (= (* a a) (.Add schoolBag a))))))

(schoolBag-add-spec)
