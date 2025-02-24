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
      (it "finds the fibonacci numbers up to n (n>=2)"
          (should= nil (get-fibonacci-to-n 0))
          (should= nil (get-fibonacci-to-n 1))
          (should= [1 2] (get-fibonacci-to-n 2))
          (should= [1 2 3] (get-fibonacci-to-n 3))
          (should= [1 2 3] (get-fibonacci-to-n 4))
          (should= [1 2 3 5] (get-fibonacci-to-n 5))
          (should= [1 2 3 5 8] (get-fibonacci-to-n 8))
          (should= [1 2 3 5 8 13] (get-fibonacci-to-n 13))
          (should= [1 2 3 5 8 13 21] (get-fibonacci-to-n 21))
          (should= [1 2 3 5 8 13 21 34] (get-fibonacci-to-n 34))
          (should= [1 2 3 5 8 13 21 34 55] (get-fibonacci-to-n 55))
          (should= [1 2 3 5 8 13 21 34 55 89] (get-fibonacci-to-n 89))
      )
      (it "gets the sum of even numbers from a vector"
          (should= 2 (get-sum-of-evens [1 2]))
          (should= 2 (get-sum-of-evens [1 2 3]))
          (should= 2 (get-sum-of-evens [1 2 3 5]))
          (should= 10 (get-sum-of-evens [1 2 3 5 8]))
      )

    (it "Solves #2"
      (should= 0 (euler-2 0))
      (should= 0 (euler-2 1))
      (should= 2 (euler-2 2))
      (should= 2 (euler-2 3))
      (should= 2 (euler-2 4))
      (should= 2 (euler-2 5))
      (should= 2 (euler-2 6))
      (should= 2 (euler-2 7))
      (should= 10 (euler-2 8))
      (should= 10 (euler-2 9))
      (should= 10 (euler-2 10))
      (should= 10 (euler-2 11))
      (should= 10 (euler-2 13))
      (should= 44 (euler-2 34))
      (should= 4613732 (euler-2 4000000))
      )
  )

(run-specs)
