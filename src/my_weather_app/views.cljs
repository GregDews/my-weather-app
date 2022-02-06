(ns my-weather-app.views
  (:require
   [re-frame.core :as re-frame]
   [my-weather-app.styles :as styles]
   [my-weather-app.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      {:class (styles/level1)}
      "Hello from " @name]
     ]))
