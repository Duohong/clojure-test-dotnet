(use '[clojure.test])
 
(System.Reflection.Assembly/LoadWithPartialName "Production")
(import (Production Calculator))

; test static method
(deftest calculator-static-add
  (is (= 3 (Calculator/Add 1 2)))
  (is (= 7 (Calculator/Add 3 4))))
  
(calculator-static-add)

; test instance method
(deftest calculator-add
  (let [c (Calculator. 1)]
    (.Add c 2)
    (.Add c 3)
    (is (= 10 (.Add c 4)))))

(calculator-add)
