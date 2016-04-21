(ns temperature-converter-example.core-spec
  (:require [speclj.core :refer :all]
            [temperature-converter-example.core :refer :all]))

(describe "temperature converter"

  (it "converts temperatures from fahrenheit to celsius"
    (should= [0 10] (convert-to-celsius [32 50]))))
