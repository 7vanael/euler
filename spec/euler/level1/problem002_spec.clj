(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2
; Fibonacci sequence, defined by adding the prior two terms,
;starting with 1 & 2. The first 10 terms are:
; 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

;Find the sum of the even valued terms for n<= 4,000,000

(describe "Euler Problem #2"

  (it "Solves #2"
    (should= -1 (euler-2 -1)))
  )

(run-specs)
