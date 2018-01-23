(ns reptile-care.views
  (:require
    [re-frame.core :as rf]
    [reptile-care.db :as db]))

(defn nav-link [uri title page]
  [:li.nav-item
   {:class (when (= page @(rf/subscribe [::db/page])) "active")}
   [:a.nav-link {:href uri} title]])

(defn navbar []
  [:nav.navbar.navbar-dark.bg-primary.navbar-expand-md
   {:role "navigation"}
   [:button.navbar-toggler.hidden-sm-up
    {:type        "button"
     :data-toggle "collapse"
     :data-target "#collapsing-navbar"} "☰"]
   [:a.navbar-brand {:href "#/"} "reptile-care"]
   [:div#collapsing-navbar.collapse.navbar-collapse
    [:ul.nav.navbar-nav.mr-auto
     [nav-link "#/" "Home" :home]]]])
