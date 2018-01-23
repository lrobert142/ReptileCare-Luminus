(ns reptile-care.core
  (:require
    [ajax.core :refer [GET POST]]
    [home.core :as home]
    [re-frame.core :as rf]
    [reagent.core :as r]
    [reptile-care.ajax :refer [load-interceptors!]]
    [reptile-care.db :as db]
    [reptile-care.routes :as routes]
    [reptile-care.views :as views]))

(def pages
  {:home #'home/view})

(defn page []
  [:div
   [views/navbar]
   [(pages @(rf/subscribe [::db/page]))]])

;; Initialize app
(defn mount-components []
  (rf/clear-subscription-cache!)
  (r/render [#'page] (.getElementById js/document "app")))

(defn init! []
  (rf/dispatch-sync [::db/initialize-db])
  (load-interceptors!)
  (routes/hook-browser-navigation!)
  (mount-components))
