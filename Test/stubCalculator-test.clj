(assembly-load-from "Production.dll")

(ns clojure-test-dotnet.test
  (:require [clojure.test :refer :all]))


; test instance method
(deftest stubCalculator-add
  (let [sc (stubCalculator.)]
    (is (= 4 (.Add sc 2)))
    (is (= 9 (.Add sc 3)))))

(stubCalculator-add)
