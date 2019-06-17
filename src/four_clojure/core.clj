(ns four-clojure.core)

;; Intro to Strings
(= "HELLO WORLD" (.toUpperCase "hello world"))

;; Intro to Lists
(= (list :a :b :c) '(:a :b :c))

;; Lists: conj
(= '(1 2 3 4) (conj '(2 3 4) 1))
(= '(1 2 3 4) (conj '(3 4) 2 1))

;; Intro to Vectors
(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
