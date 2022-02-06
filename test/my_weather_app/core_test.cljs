(ns my-weather-app.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [my-weather-app.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
