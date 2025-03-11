(ns euler.level1.problem009-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem009 :refer :all]))

; https://projecteuler.net/problem=9
#_(A pythagorean triplet is a set of 3 natural numbers
     a < b < c for which a ** 2 + b ** 2 = c ** 2
     What is the product of abc such that
     a + b + c = 1000)

(describe "Euler Problem #9"
  #_(it "finds pythagorean triples"
    (should= [3 4 5] (find-triples 12))
    (should= [3 4 5] (find-triples 30))
      )
  (it "finds the square of a number"
    (should= 4 (squared 2))
    (should= 9 (squared 3)))

  (it "identifies if three numbers are unique"
    (should= true (unique? [3 4 5]))
    (should= false (unique? [3 4 4])))

  (it "identifies if a trio of numbers are pythagorean"
    (should= true (pythagorean? [3 4 5]))
    (should= true (pythagorean? [5 12 13]))
    (should= false (pythagorean? [5 12 15])))

  (it "identifies if a set of numbers adds up to n"
    (should= true (sum-to-n? 12 [3 4 5]))
    (should= false (sum-to-n? 13 [3 4 5]))
    )

  (it "identifies if a trio of numbers is unique, sums to n and is pythagorean"
    (should= true (meets-acceptance-criteria? 12 [3 4 5]))
    (should= true (meets-acceptance-criteria? 30 [5 12 13]))
    (should= false (meets-acceptance-criteria? 13 [3 4 5]))
    (should= false (meets-acceptance-criteria? 12 [3 3 5]))
    )

  (it "finds the desired top range; n/2 rounded down, then + 1"
    (should= 2 (range-top 3))
    (should= 3 (range-top 4))
    (should= 3 (range-top 5))
    )

  (it "returns all pairs of numbers up to n"
    (should= [[1 2]] (find-pairs 3))
    (should= [[1 3] [2 2]] (find-pairs 4))
    (should= [[1 4] [2 3]] (find-pairs 5))
    )

  (it "finds triples up to n"
    (should= [[1 2 3]] (find-triples 6))
    (should= [[1 3 3] [2 2 3] [1 2 4]] (find-triples 7))
    (should= [[1 4 3] [2 3 3] [1 3 4] [2 2 4] [1 2 5]] (find-triples 8))
    )

  (it "gets an acceptable triple"
    (should= [[3 4 5]] (get-acceptable-triple 12))
    (should= [[5 12 13]] (get-acceptable-triple 30))
    )

  (it "Solves #9"
    (should= [60] (euler-9 12))
    (should= [780] (euler-9 30))
    (should= [2040] (euler-9 40))
    (should= [595140] (euler-9 260))
    (should= [31875000] (euler-9 1000))
    ))

(run-specs)