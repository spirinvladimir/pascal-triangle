(defn createLine [oldLine]
  (println oldLine)
  (reduce
    (fn [newLine current]
      (conj
        newLine
        (+
           current
           (let [index (count newLine)]
             (if (zero? index)
               0
               (nth oldLine (dec index)))))))
    []
    (conj oldLine 0)))

(defn f [n]
  (reduce
    (fn [lines x]
      (conj lines (createLine (last lines))))
    [[1]]
    (range n)))

(f 4)
