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

(describe "Euler Problem #4"

    (it "identifies if a number is a palindrome"
        (should= true (is-palindrome 101))
        (should= true (is-palindrome 1001))
        (should= true (is-palindrome 10001))
        (should= false (is-palindrome 100))
        (should= false (is-palindrome 1005))
        (should= false (is-palindrome 10054))
        ;(it "Solves #4"
        ;  (should= -1 (euler-4 -1)))
        ))

(run-specs)
