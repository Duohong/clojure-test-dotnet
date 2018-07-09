(assembly-load-from "Production.dll")

(ns clojure-test-dotnet.test
  (:import (Production Calculator))
  (:require [clojure.test :refer :all]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]))


; test static method
(deftest calculator-static-add
  (is (= 3 (Calculator/Add 1 2)))
  (is (= 7 (Calculator/Add 3 4))))
  
(calculator-static-add)

; test instance method
(deftest calculator-add
  (let [cal (Calculator. 1)] ; = 1
    (is (= 3 (.Add cal 2)))            
    (is (= 0 (.Clear cal)))            
    (is (= 3 (.Add cal 3)))            
    (is (= 7 (.Add cal 4)))))

(calculator-add)

(deftest calculator-add-gen
  (let [ab (gen/sample (gen/choose -1000 1000) 2)]
    (is (= (+ (first ab) (second ab)) (Calculator/Add (first ab) (second ab))))))            

(calculator-add-gen)
