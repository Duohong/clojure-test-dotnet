(assembly-load-from "Production.dll")

(ns stubCalculator
  (:require [clojure.core])
  (:gen-class
;    :init init
	:main false
    :implements [Production.ICalculator]))

;(defn -init []
;  [[] (ref {})]
;)

(defn -Add [this a]
  (int (* a a))
)
