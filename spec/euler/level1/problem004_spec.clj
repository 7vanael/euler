(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4
#_(A palindromic number reads the same both ways
     The largest palindrome made from the product of 2 digit
     numbers is 9009 = 91 * 99
     Find the largest palindrome made from the product of
     two 3 digit numbers)

(focus-describe "Euler Problem #4"

  (it "identifies if a number is a palindrome"
      (should= true (is-palindrome 101))
      (should= false (is-palindrome 100)))
  ;(it "Solves #4"
  ;  (should= -1 (euler-4 -1)))
  )

(run-specs)
