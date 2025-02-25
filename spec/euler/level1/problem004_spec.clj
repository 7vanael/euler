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
        (should= true (is-palindrome 1001))
        (should= true (is-palindrome 10001))
        (should= false (is-palindrome 100))
        (should= false (is-palindrome 1005))
        (should= false (is-palindrome 10054)))

    (it "gets the highest number using n number of digits"
        (should= 9 (highest-digit-number 1))
        (should= 99 (highest-digit-number 2))
        (should= 999 (highest-digit-number 3))
        (should= 9999 (highest-digit-number 4)))

    (it "gets all palindromes"
        (should= [9 8 7 6 5 4 3 2 1] (get-all-palindromes 1))
        (should= [9009 8118 7227 6336 5445 4554 3663 2772 1881 5335 8448 4224 2112
                  5225 5115 8008 7007 6006 5005 4004 3003 2002 1001 979 6776 4664 2992
                  2552 858 5775 4774 3773 1771 4884 2442 888 949 828 737 868 767 696 969
                  616 2332 848 636 676 686 1551 585 484 989 656 646 494 1221 999 777 666
                  555 444 595 525 363 434 464 575 414 242 252 323 272 121] (get-all-palindromes 2)))

    (it "Solves #4"
      (should= "You must enter a number of digits greater than 0" (euler-4 0))
      (should= 9 (euler-4 1))
      (should= 9009 (euler-4 2))
      (should= 906609 (euler-4 3))))

(run-specs)
