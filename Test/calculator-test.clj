(use '[clojure.test])
 
(System.Reflection.Assembly/LoadWithPartialName "Production")
(import (Production Calculator))

(is (= 3 (Calculator/Add 1 2)))

(is (= 3 (Calculator/Add 2 2)))

;  (deftest add
;(is (= 4 (+ 2 2)))
;(is (= 7 (+ 3 4))))

