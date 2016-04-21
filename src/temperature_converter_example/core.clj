(ns temperature-converter-example.core)

(defn fahrenheit-to-celsius [temp]
  (* (/ 5 9) (- temp 32)))

(defn convert-to-celsius [coll]
  (map fahrenheit-to-celsius coll))
