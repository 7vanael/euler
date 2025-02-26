(ns euler.level1.problem005)

(defn get-multiple [n]
  (loop [current-factor 1 current-multiple 1]
    (cond (< n current-factor) current-multiple
          (= 0 (rem current-multiple current-factor))
             (recur (inc current-factor) current-multiple)
          :else (recur (inc current-factor) (* current-multiple current-factor)))))

(defn divisible-by-all? [multiple n]
  (loop [multiple multiple n n]
    (cond (<= n 1) true
          (not= 0 (rem multiple n)) false
          :else (recur multiple (dec n)))))

(defn euler-5 [n]
  (if (< n 3)
    n
    (get-multiple n)))
