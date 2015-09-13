(ns net.clm.history.pages.pgIndex
    (:require [hiccup.core :as hcore]
      [hiccup.page :as hic]
      [net.clm.history.pages.snippets :as snippets]
      [net.clm.history.pages.menus :as menu]))

(defn pctabs []
  (list
    [:ul
     {:class "nav nav-tabs", :role "tablist", :style "background-color: lightgrey;"}
     [:li {:class "active"} [:a {:shape "rect", :id "tab-1", :href "#one", :role "tab", :data-toggle "tab"} "Events"]]
     [:li [:a {:shape "rect", :id "tab-2", :href "#two", :role "tab", :data-toggle "tab"} "People"]]
     [:li [:a {:shape "rect", :id "tab-2", :href "#three", :role "tab", :data-toggle "tab"} "Places"]]
     [:li [:a {:shape "rect", :id "tab-3", :href "#four", :role "tab", :data-toggle "tab"} "Relationships"]]]))

(defn table-events []
  (list
    [:table {:class "cell-border stripe", :id "tblEvents"}
     [:thead
      [:tr
       [:th {:colspan "6", :rowspan "1"}]
       [:th {:colspan "2", :rowspan "1", :class "dt-head-center"} "Bible"]
       [:th {:colspan "2", :rowspan "1", :class "dt-head-center"} "Gregorian"]
       [:th {:colspan "1", :rowspan "1"}]]
      [:tr
       [:th {:colspan "1", :rowspan "1", :class "cid"} "ID"]
       [:th {:colspan "1", :rowspan "1", :class "clabels"} "Labels"]
       [:th {:colspan "1", :rowspan "1", :class "cname"} "Name"]
       [:th {:colspan "1", :rowspan "1", :class "ccaption"} "Caption"]
       [:th {:colspan "1", :rowspan "1", :class "ctype"} "Type"]
       [:th {:colspan "1", :rowspan "1", :class "cplace"} "Place"]
       [:th {:colspan "1", :rowspan "1", :class "cbstart"} "Start"]
       [:th {:colspan "1", :rowspan "1", :class "cbend"} "End"]
       [:th {:colspan "1", :rowspan "1", :class "cgstart"} "Start"]
       [:th {:colspan "1", :rowspan "1", :class "cgend"} "End"]
       [:th {:colspan "1", :rowspan "1", :class "cnotes"} "Notes"]]]
     [:tbody
      [:tr
       [:td {:colspan "1", :rowspan "1"} "0"]
       [:td {:colspan "1", :rowspan "1"} "Event:Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Precessional_Era_of_Leo"]
       [:td {:colspan "1", :rowspan "1"} "Precessional Era of Leo"]
       [:td {:colspan "1", :rowspan "1"} "Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]
       [:td {:colspan "1", :rowspan "1"} "-105"]
       [:td {:colspan "1", :rowspan "1"} "2095"]
       [:td {:colspan "1", :rowspan "1"} "-11080"]
       [:td {:colspan "1", :rowspan "1"} "-8880"]
       [:td {:colspan "1", :rowspan "1"} "The Precessional Era of Leo (2,200 years)"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "6"]
       [:td {:colspan "1", :rowspan "1"} "Event:Life"]
       [:td {:colspan "1", :rowspan "1"} "Adam_Is_Created"]
       [:td {:colspan "1", :rowspan "1"} "Adam is Created"]
       [:td {:colspan "1", :rowspan "1"} "Life"]
       [:td {:colspan "1", :rowspan "1"} "Africa"]
       [:td {:colspan "1", :rowspan "1"} "1"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-10974"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td
        {:colspan "1", :rowspan "1"}
        "CREATION - Genesis 1:3; on the 6th day GOD MAKES ADAM, the first Man who, because of his sin, lived for only 930 years."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "14"]
       [:td {:colspan "1", :rowspan "1"} "Event:Astro"]
       [:td {:colspan "1", :rowspan "1"} "Giza_Model_ofthe_Sky"]
       [:td {:colspan "1", :rowspan "1"} "The Construction on the Giza Plateau Reflects the Stars"]
       [:td {:colspan "1", :rowspan "1"} "Astro"]
       [:td {:colspan "1", :rowspan "1"} "Egypt"]
       [:td {:colspan "1", :rowspan "1"} "475"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-10600"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td
        {:colspan "1", :rowspan "1"}
        "From the Giza Plateau (looking south) the Milky Way Galaxy appears to be an extension of the Nile."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "15"]
       [:td {:colspan "1", :rowspan "1"} "Event:Astro"]
       [:td {:colspan "1", :rowspan "1"} "Leo_Rises_Vernal_Equinox"]
       [:td {:colspan "1", :rowspan "1"} "Leo Rises on the Vernal Equinox"]
       [:td {:colspan "1", :rowspan "1"} "Astro"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]
       [:td {:colspan "1", :rowspan "1"} "475"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-10600"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "Leo Rises on the Vernal Equinox."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "18"]
       [:td {:colspan "1", :rowspan "1"} "Event:Culture"]
       [:td {:colspan "1", :rowspan "1"} "Kubbaniya_Culture"]
       [:td {:colspan "1", :rowspan "1"} "Kubbaniya Culture"]
       [:td {:colspan "1", :rowspan "1"} "Culture"]
       [:td {:colspan "1", :rowspan "1"} "Egypt"]
       [:td {:colspan "1", :rowspan "1"} "976"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-9998"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "Egypt: The Kubbaniya culture develops along the Nile."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "20"]
       [:td {:colspan "1", :rowspan "1"} "Event:Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Tiwanaku_Sun_Gate"]
       [:td {:colspan "1", :rowspan "1"} "The Sun Gate"]
       [:td {:colspan "1", :rowspan "1"} "Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Bolivia"]
       [:td {:colspan "1", :rowspan "1"} "474"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-10500"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "Egypt: The Kubbaniya culture develops along the Nile."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "22"]
       [:td {:colspan "1", :rowspan "1"} "Event:Construction"]
       [:td {:colspan "1", :rowspan "1"} "Gobekli_Tepe"]
       [:td {:colspan "1", :rowspan "1"} "Gobekli Tepe"]
       [:td {:colspan "1", :rowspan "1"} "Construction"]
       [:td {:colspan "1", :rowspan "1"} "Turkey"]
       [:td {:colspan "1", :rowspan "1"} "1847"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-9130"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td
        {:colspan "1", :rowspan "1"}
        "Turkey: ??anl??urfa (Edessa): Gobekli  Tepe (Turkish 'Mountain with a navel') is a hilltop sanctuary built on the highest point of an elongated mountain ridge in southeast Turkey. The site was erected 11,500 years ago. Some consider it the oldest known shrine or temple complex in the world, and Earth's oldest known example of monumental architecture."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "123"]
       [:td {:colspan "1", :rowspan "1"} "Event:Life"]
       [:td {:colspan "1", :rowspan "1"} "Mahalaleel"]
       [:td {:colspan "1", :rowspan "1"} "Mahalaleel"]
       [:td {:colspan "1", :rowspan "1"} "Life"]
       [:td {:colspan "1", :rowspan "1"} "Israel"]
       [:td {:colspan "1", :rowspan "1"} "2049"]
       [:td {:colspan "1", :rowspan "1"} "2938"]
       [:td {:colspan "1", :rowspan "1"} "-8929"]
       [:td {:colspan "1", :rowspan "1"} "-8036"]
       [:td {:colspan "1", :rowspan "1"} "Mahalaleel lives for 895 years."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "2024"]
       [:td {:colspan "1", :rowspan "1"} "Event:Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Precessional_Era_of_Cancer"]
       [:td {:colspan "1", :rowspan "1"} "Precessional Era of Cancer"]
       [:td {:colspan "1", :rowspan "1"} "Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]
       [:td {:colspan "1", :rowspan "1"} "2097"]
       [:td {:colspan "1", :rowspan "1"} "4296"]
       [:td {:colspan "1", :rowspan "1"} "-8880"]
       [:td {:colspan "1", :rowspan "1"} "-6681"]
       [:td {:colspan "1", :rowspan "1"} "The Precessional Era of Cancer (2,199 years)"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "30025"]
       [:td {:colspan "1", :rowspan "1"} "Event:Life"]
       [:td {:colspan "1", :rowspan "1"} "Jared"]
       [:td {:colspan "1", :rowspan "1"} "Jared"]
       [:td {:colspan "1", :rowspan "1"} "Life"]
       [:td {:colspan "1", :rowspan "1"} "Israel"]
       [:td {:colspan "1", :rowspan "1"} "2944"]
       [:td {:colspan "1", :rowspan "1"} "3906"]
       [:td {:colspan "1", :rowspan "1"} "-8035"]
       [:td {:colspan "1", :rowspan "1"} "-7076"]
       [:td {:colspan "1", :rowspan "1"} "Mahalaleel lives for 962 years."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "400026"]
       [:td {:colspan "1", :rowspan "1"} "Event:Monument"]
       [:td {:colspan "1", :rowspan "1"} "Yonaguni_Monument"]
       [:td {:colspan "1", :rowspan "1"} "Yonaguni Monument"]
       [:td {:colspan "1", :rowspan "1"} "Monument"]
       [:td {:colspan "1", :rowspan "1"} "Japan"]
       [:td {:colspan "1", :rowspan "1"} "2978"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-8000"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "Japan: Yonaguni: The Yonaguni Monument (now submerged) is constructed."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "5000026"]
       [:td {:colspan "1", :rowspan "1"} "Event:Migration"]
       [:td {:colspan "1", :rowspan "1"} "Ohlone_Settle_in_CA"]
       [:td {:colspan "1", :rowspan "1"} "The Ohlone Settle in California"]
       [:td {:colspan "1", :rowspan "1"} "Migration"]
       [:td {:colspan "1", :rowspan "1"} "California"]
       [:td {:colspan "1", :rowspan "1"} "2978"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-8000"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td
        {:colspan "1", :rowspan "1"}
        "US: California: settlement of Ohlone tribe in the area of San Francisco, California"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "0"]
       [:td {:colspan "1", :rowspan "1"} "Event:Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Precessional_Era_of_Leo"]
       [:td {:colspan "1", :rowspan "1"} "Precessional Era of Leo"]
       [:td {:colspan "1", :rowspan "1"} "Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]
       [:td {:colspan "1", :rowspan "1"} "-105"]
       [:td {:colspan "1", :rowspan "1"} "2095"]
       [:td {:colspan "1", :rowspan "1"} "-11080"]
       [:td {:colspan "1", :rowspan "1"} "-8880"]
       [:td {:colspan "1", :rowspan "1"} "The Precessional Era of Leo (2,200 years)"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "6"]
       [:td {:colspan "1", :rowspan "1"} "Event:Life"]
       [:td {:colspan "1", :rowspan "1"} "Adam_Is_Created"]
       [:td {:colspan "1", :rowspan "1"} "Adam is Created"]
       [:td {:colspan "1", :rowspan "1"} "Life"]
       [:td {:colspan "1", :rowspan "1"} "Africa"]
       [:td {:colspan "1", :rowspan "1"} "1"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-10974"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td
        {:colspan "1", :rowspan "1"}
        "CREATION - Genesis 1:3; on the 6th day GOD MAKES ADAM, the first Man who, because of his sin, lived for only 930 years."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "14"]
       [:td {:colspan "1", :rowspan "1"} "Event:Astro"]
       [:td {:colspan "1", :rowspan "1"} "Giza_Model_ofthe_Sky"]
       [:td {:colspan "1", :rowspan "1"} "The Construction on the Giza Plateau Reflects the Stars"]
       [:td {:colspan "1", :rowspan "1"} "Astro"]
       [:td {:colspan "1", :rowspan "1"} "Egypt"]
       [:td {:colspan "1", :rowspan "1"} "475"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-10600"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td
        {:colspan "1", :rowspan "1"}
        "From the Giza Plateau (looking south) the Milky Way Galaxy appears to be an extension of the Nile."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "15"]
       [:td {:colspan "1", :rowspan "1"} "Event:Astro"]
       [:td {:colspan "1", :rowspan "1"} "Leo_Rises_Vernal_Equinox"]
       [:td {:colspan "1", :rowspan "1"} "Leo Rises on the Vernal Equinox"]
       [:td {:colspan "1", :rowspan "1"} "Astro"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]
       [:td {:colspan "1", :rowspan "1"} "475"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-10600"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "Leo Rises on the Vernal Equinox."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "18"]
       [:td {:colspan "1", :rowspan "1"} "Event:Culture"]
       [:td {:colspan "1", :rowspan "1"} "Kubbaniya_Culture"]
       [:td {:colspan "1", :rowspan "1"} "Kubbaniya Culture"]
       [:td {:colspan "1", :rowspan "1"} "Culture"]
       [:td {:colspan "1", :rowspan "1"} "Egypt"]
       [:td {:colspan "1", :rowspan "1"} "976"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-9998"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "Egypt: The Kubbaniya culture develops along the Nile."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "20"]
       [:td {:colspan "1", :rowspan "1"} "Event:Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Tiwanaku_Sun_Gate"]
       [:td {:colspan "1", :rowspan "1"} "The Sun Gate"]
       [:td {:colspan "1", :rowspan "1"} "Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Bolivia"]
       [:td {:colspan "1", :rowspan "1"} "474"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-10500"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "Egypt: The Kubbaniya culture develops along the Nile."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "22"]
       [:td {:colspan "1", :rowspan "1"} "Event:Construction"]
       [:td {:colspan "1", :rowspan "1"} "Gobekli_Tepe"]
       [:td {:colspan "1", :rowspan "1"} "Gobekli Tepe"]
       [:td {:colspan "1", :rowspan "1"} "Construction"]
       [:td {:colspan "1", :rowspan "1"} "Turkey"]
       [:td {:colspan "1", :rowspan "1"} "1847"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-9130"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td
        {:colspan "1", :rowspan "1"}
        "Turkey: ??anl??urfa (Edessa): Gobekli  Tepe (Turkish 'Mountain with a navel') is a hilltop sanctuary built on the highest point of an elongated mountain ridge in southeast Turkey. The site was erected 11,500 years ago. Some consider it the oldest known shrine or temple complex in the world, and Earth's oldest known example of monumental architecture."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "123"]
       [:td {:colspan "1", :rowspan "1"} "Event:Life"]
       [:td {:colspan "1", :rowspan "1"} "Mahalaleel"]
       [:td {:colspan "1", :rowspan "1"} "Mahalaleel"]
       [:td {:colspan "1", :rowspan "1"} "Life"]
       [:td {:colspan "1", :rowspan "1"} "Israel"]
       [:td {:colspan "1", :rowspan "1"} "2049"]
       [:td {:colspan "1", :rowspan "1"} "2938"]
       [:td {:colspan "1", :rowspan "1"} "-8929"]
       [:td {:colspan "1", :rowspan "1"} "-8036"]
       [:td {:colspan "1", :rowspan "1"} "Mahalaleel lives for 895 years."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "2024"]
       [:td {:colspan "1", :rowspan "1"} "Event:Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Precessional_Era_of_Cancer"]
       [:td {:colspan "1", :rowspan "1"} "Precessional Era of Cancer"]
       [:td {:colspan "1", :rowspan "1"} "Calendar"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]
       [:td {:colspan "1", :rowspan "1"} "2097"]
       [:td {:colspan "1", :rowspan "1"} "4296"]
       [:td {:colspan "1", :rowspan "1"} "-8880"]
       [:td {:colspan "1", :rowspan "1"} "-6681"]
       [:td {:colspan "1", :rowspan "1"} "The Precessional Era of Cancer (2,199 years)"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "30025"]
       [:td {:colspan "1", :rowspan "1"} "Event:Life"]
       [:td {:colspan "1", :rowspan "1"} "Jared"]
       [:td {:colspan "1", :rowspan "1"} "Jared"]
       [:td {:colspan "1", :rowspan "1"} "Life"]
       [:td {:colspan "1", :rowspan "1"} "Israel"]
       [:td {:colspan "1", :rowspan "1"} "2944"]
       [:td {:colspan "1", :rowspan "1"} "3906"]
       [:td {:colspan "1", :rowspan "1"} "-8035"]
       [:td {:colspan "1", :rowspan "1"} "-7076"]
       [:td {:colspan "1", :rowspan "1"} "Mahalaleel lives for 962 years."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "400026"]
       [:td {:colspan "1", :rowspan "1"} "Event:Monument"]
       [:td {:colspan "1", :rowspan "1"} "Yonaguni_Monument"]
       [:td {:colspan "1", :rowspan "1"} "Yonaguni Monument"]
       [:td {:colspan "1", :rowspan "1"} "Monument"]
       [:td {:colspan "1", :rowspan "1"} "Japan"]
       [:td {:colspan "1", :rowspan "1"} "2978"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-8000"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "Japan: Yonaguni: The Yonaguni Monument (now submerged) is constructed."]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "5000026"]
       [:td {:colspan "1", :rowspan "1"} "Event:Migration"]
       [:td {:colspan "1", :rowspan "1"} "Ohlone_Settle_in_CA"]
       [:td {:colspan "1", :rowspan "1"} "The Ohlone Settle in California"]
       [:td {:colspan "1", :rowspan "1"} "Migration"]
       [:td {:colspan "1", :rowspan "1"} "California"]
       [:td {:colspan "1", :rowspan "1"} "2978"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"} "-8000"]
       [:td {:colspan "1", :rowspan "1"}]
       [:td {:colspan "1", :rowspan "1"}
        "US: California: settlement of Ohlone tribe in the area of San Francisco, California"]]]]))

(defn table-people []
  [:table {:class "cell-border stripe", :id "tblPeople"}
   [:thead
    [:tr
     [:th {:colspan "4", :rowspan "1"}]
     [:th {:colspan "2", :rowspan "1", :class "dt-head-center"} "Place"]
     [:th {:colspan "2", :rowspan "1", :class "dt-head-center"} "Parents"]
     [:th {:colspan "1", :rowspan "1"}]
     [:th {:colspan "2", :rowspan "1", :class "dt-head-center"} "Bible"]
     [:th {:colspan "2", :rowspan "1", :class "dt-head-center"} "Gregorian"]
     [:th {:colspan "1", :rowspan "1"}]]
    [:tr
     [:th {:colspan "1", :rowspan "1", :class "cid"} "ID"]
     [:th {:colspan "1", :rowspan "1", :class "clabels"} "Labels"]
     [:th {:colspan "1", :rowspan "1", :class "cname"} "Name"]
     [:th {:colspan "1", :rowspan "1", :class "ccaption"} "Caption"]
     [:th {:colspan "1", :rowspan "1", :class "cbirth"} "...of Birth"]
     [:th {:colspan "1", :rowspan "1", :class "cdeath"} "...of Death"]
     [:th {:colspan "1", :rowspan "1", :class "cdata"} "Father"]
     [:th {:colspan "1", :rowspan "1", :class "cmom"} "Mother"]
     [:th {:colspan "1", :rowspan "1", :class "ctype"} "Type"]
     [:th {:colspan "1", :rowspan "1", :class "cbstart"} "Start"]
     [:th {:colspan "1", :rowspan "1", :class "cbend"} "End"]
     [:th {:colspan "1", :rowspan "1", :class "cgstart"} "Start"]
     [:th {:colspan "1", :rowspan "1", :class "cgend"} "End"]
     [:th {:colspan "1", :rowspan "1", :class "cnotes"} "Notes"]]]
   [:tbody
    [:tr
     [:td {:colspan "1", :rowspan "1"} "5"]
     [:td {:colspan "1", :rowspan "1"} "GOD:Person:Spirit"]
     [:td {:colspan "1", :rowspan "1"} "YHWH"]
     [:td {:colspan "1", :rowspan "1"} "YHWH"]
     [:td {:colspan "1", :rowspan "1"} "Africa"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "NONE"]
     [:td {:colspan "1", :rowspan "1"} "NONE"]
     [:td {:colspan "1", :rowspan "1"} "Spirit"]
     [:td {:colspan "1", :rowspan "1"} "0"]
     [:td {:colspan "1", :rowspan "1"} "0"]
     [:td {:colspan "1", :rowspan "1"} "0"]
     [:td {:colspan "1", :rowspan "1"} "0"]
     [:td {:colspan "1", :rowspan "1"} "YHWH, the Creator of all things, with no beginning and no end."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "8"]
     [:td {:colspan "1", :rowspan "1"} "Adam:Person:Human:Male"]
     [:td {:colspan "1", :rowspan "1"} "Adam_Ben_YHWH"]
     [:td {:colspan "1", :rowspan "1"} "Adam Ben YHWH"]
     [:td {:colspan "1", :rowspan "1"} "Africa"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "NONE"]
     [:td {:colspan "1", :rowspan "1"} "GOD"]
     [:td {:colspan "1", :rowspan "1"} "Male"]
     [:td {:colspan "1", :rowspan "1"} "1"]
     [:td {:colspan "1", :rowspan "1"} "930"]
     [:td {:colspan "1", :rowspan "1"} "-10974"]
     [:td {:colspan "1", :rowspan "1"} "-10044"]
     [:td {:colspan "1", :rowspan "1"} "Adam, the First Human, lives for 930 years."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "10"]
     [:td {:colspan "1", :rowspan "1"} "Eve:Person:Human:Female"]
     [:td {:colspan "1", :rowspan "1"} "Eve_Isha_Adam"]
     [:td {:colspan "1", :rowspan "1"} "Eve Isha Adam"]
     [:td {:colspan "1", :rowspan "1"} "Africa"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "NONE"]
     [:td {:colspan "1", :rowspan "1"} "GOD"]
     [:td {:colspan "1", :rowspan "1"} "Female"]
     [:td {:colspan "1", :rowspan "1"} "1"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td {:colspan "1", :rowspan "1"} "-10974"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td {:colspan "1", :rowspan "1"} "Eve, the Mother of all humanity, has no length of years listed."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "11"]
     [:td {:colspan "1", :rowspan "1"} "Seth:Person:Human:Male"]
     [:td {:colspan "1", :rowspan "1"} "Seth_Ben_Adam"]
     [:td {:colspan "1", :rowspan "1"} "Seth Ben Adam"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Adam"]
     [:td {:colspan "1", :rowspan "1"} "Eve"]
     [:td {:colspan "1", :rowspan "1"} "Male"]
     [:td {:colspan "1", :rowspan "1"} "130"]
     [:td {:colspan "1", :rowspan "1"} "1042"]
     [:td {:colspan "1", :rowspan "1"} "-10846"]
     [:td {:colspan "1", :rowspan "1"} "-9934"]
     [:td {:colspan "1", :rowspan "1"} "Seth, Adam's third recorded son, lives for 912 years."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "13"]
     [:td {:colspan "1", :rowspan "1"} "Enos:Person:Human:Male"]
     [:td {:colspan "1", :rowspan "1"} "Enos_Ben_Seth"]
     [:td {:colspan "1", :rowspan "1"} "Enos Ben Seth"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Seth"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td {:colspan "1", :rowspan "1"} "Male"]
     [:td {:colspan "1", :rowspan "1"} "234"]
     [:td {:colspan "1", :rowspan "1"} "1139"]
     [:td {:colspan "1", :rowspan "1"} "-10741"]
     [:td {:colspan "1", :rowspan "1"} "-9839"]
     [:td {:colspan "1", :rowspan "1"} "Enos lives for 905 years."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "19"]
     [:td {:colspan "1", :rowspan "1"} "Cainan:Person:Human:Male"]
     [:td {:colspan "1", :rowspan "1"} "Cainan_Ben_Enos"]
     [:td {:colspan "1", :rowspan "1"} "Cainan Ben Enos"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Enos"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td {:colspan "1", :rowspan "1"} "Male"]
     [:td {:colspan "1", :rowspan "1"} "1139"]
     [:td {:colspan "1", :rowspan "1"} "2044"]
     [:td {:colspan "1", :rowspan "1"} "-9838"]
     [:td {:colspan "1", :rowspan "1"} "-8930"]
     [:td {:colspan "1", :rowspan "1"} "Cainan lives for 910 years."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "105"]
     [:td {:colspan "1", :rowspan "1"} "GOD:Person:Spirit"]
     [:td {:colspan "1", :rowspan "1"} "YHWH"]
     [:td {:colspan "1", :rowspan "1"} "YHWH"]
     [:td {:colspan "1", :rowspan "1"} "Africa"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "NONE"]
     [:td {:colspan "1", :rowspan "1"} "NONE"]
     [:td {:colspan "1", :rowspan "1"} "Spirit"]
     [:td {:colspan "1", :rowspan "1"} "0"]
     [:td {:colspan "1", :rowspan "1"} "0"]
     [:td {:colspan "1", :rowspan "1"} "0"]
     [:td {:colspan "1", :rowspan "1"} "0"]
     [:td {:colspan "1", :rowspan "1"} "YHWH, the Creator of all things, with no beginning and no end."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "2008"]
     [:td {:colspan "1", :rowspan "1"} "Adam:Person:Human:Male"]
     [:td {:colspan "1", :rowspan "1"} "Adam_Ben_YHWH"]
     [:td {:colspan "1", :rowspan "1"} "Adam Ben YHWH"]
     [:td {:colspan "1", :rowspan "1"} "Africa"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "NONE"]
     [:td {:colspan "1", :rowspan "1"} "GOD"]
     [:td {:colspan "1", :rowspan "1"} "Male"]
     [:td {:colspan "1", :rowspan "1"} "1"]
     [:td {:colspan "1", :rowspan "1"} "930"]
     [:td {:colspan "1", :rowspan "1"} "-10974"]
     [:td {:colspan "1", :rowspan "1"} "-10044"]
     [:td {:colspan "1", :rowspan "1"} "Adam, the First Human, lives for 930 years."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "30010"]
     [:td {:colspan "1", :rowspan "1"} "Eve:Person:Human:Female"]
     [:td {:colspan "1", :rowspan "1"} "Eve_Isha_Adam"]
     [:td {:colspan "1", :rowspan "1"} "Eve Isha Adam"]
     [:td {:colspan "1", :rowspan "1"} "Africa"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "NONE"]
     [:td {:colspan "1", :rowspan "1"} "GOD"]
     [:td {:colspan "1", :rowspan "1"} "Female"]
     [:td {:colspan "1", :rowspan "1"} "1"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td {:colspan "1", :rowspan "1"} "-10974"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td {:colspan "1", :rowspan "1"} "Eve, the Mother of all humanity, has no length of years listed."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "400011"]
     [:td {:colspan "1", :rowspan "1"} "Seth:Person:Human:Male"]
     [:td {:colspan "1", :rowspan "1"} "Seth_Ben_Adam"]
     [:td {:colspan "1", :rowspan "1"} "Seth Ben Adam"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Adam"]
     [:td {:colspan "1", :rowspan "1"} "Eve"]
     [:td {:colspan "1", :rowspan "1"} "Male"]
     [:td {:colspan "1", :rowspan "1"} "130"]
     [:td {:colspan "1", :rowspan "1"} "1042"]
     [:td {:colspan "1", :rowspan "1"} "-10846"]
     [:td {:colspan "1", :rowspan "1"} "-9934"]
     [:td {:colspan "1", :rowspan "1"} "Seth, Adam's third recorded son, lives for 912 years."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "5000013"]
     [:td {:colspan "1", :rowspan "1"} "Enos:Person:Human:Male"]
     [:td {:colspan "1", :rowspan "1"} "Enos_Ben_Seth"]
     [:td {:colspan "1", :rowspan "1"} "Enos Ben Seth"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Seth"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td {:colspan "1", :rowspan "1"} "Male"]
     [:td {:colspan "1", :rowspan "1"} "234"]
     [:td {:colspan "1", :rowspan "1"} "1139"]
     [:td {:colspan "1", :rowspan "1"} "-10741"]
     [:td {:colspan "1", :rowspan "1"} "-9839"]
     [:td {:colspan "1", :rowspan "1"} "Enos lives for 905 years."]]
    [:tr
     [:td {:colspan "1", :rowspan "1"} "60000019"]
     [:td {:colspan "1", :rowspan "1"} "Cainan:Person:Human:Male"]
     [:td {:colspan "1", :rowspan "1"} "Cainan_Ben_Enos"]
     [:td {:colspan "1", :rowspan "1"} "Cainan Ben Enos"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Middle East"]
     [:td {:colspan "1", :rowspan "1"} "Enos"]
     [:td {:colspan "1", :rowspan "1"}]
     [:td {:colspan "1", :rowspan "1"} "Male"]
     [:td {:colspan "1", :rowspan "1"} "1139"]
     [:td {:colspan "1", :rowspan "1"} "2044"]
     [:td {:colspan "1", :rowspan "1"} "-9838"]
     [:td {:colspan "1", :rowspan "1"} "-8930"]
     [:td {:colspan "1", :rowspan "1"} "Cainan lives for 910 years."]]]])

(defn table-places []
  (list
    [:table {:class "cell-border stripe", :id "tblPlaces"}
     [:thead
      [:tr
       [:th {:colspan "1", :rowspan "1", :class "cid"} "ID"]
       [:th {:colspan "1", :rowspan "1", :class "clabels"} "Labels"]
       [:th {:colspan "1", :rowspan "1", :class "cname"} "Name"]
       [:th {:colspan "1", :rowspan "1", :class "ccaption"} "Caption"]]]
     [:tbody
      [:tr
       [:td {:colspan "1", :rowspan "1"} "1"]
       [:td {:colspan "1", :rowspan "1"} "Earth:Planet:Place"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "2"]
       [:td {:colspan "1", :rowspan "1"} "Sol:Star:Place"]
       [:td {:colspan "1", :rowspan "1"} "Sol"]
       [:td {:colspan "1", :rowspan "1"} "Sol"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "3"]
       [:td {:colspan "1", :rowspan "1"} "Milky_Way:Galaxy:Place"]
       [:td {:colspan "1", :rowspan "1"} "Milky_Way"]
       [:td {:colspan "1", :rowspan "1"} "Milky Way"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "4"]
       [:td {:colspan "1", :rowspan "1"} "Universe:Place"]
       [:td {:colspan "1", :rowspan "1"} "Universe"]
       [:td {:colspan "1", :rowspan "1"} "Universe"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "5"]
       [:td {:colspan "1", :rowspan "1"} "GOD:Person:Place:Spirit"]
       [:td {:colspan "1", :rowspan "1"} "YHWH"]
       [:td {:colspan "1", :rowspan "1"} "YHWH"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "7"]
       [:td {:colspan "1", :rowspan "1"} "Africa:Continent:Place"]
       [:td {:colspan "1", :rowspan "1"} "Africa"]
       [:td {:colspan "1", :rowspan "1"} "Africa"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "9"]
       [:td {:colspan "1", :rowspan "1"} "Middle_East:Continent:Place"]
       [:td {:colspan "1", :rowspan "1"} "Middle_East"]
       [:td {:colspan "1", :rowspan "1"} "Middle East"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "13"]
       [:td {:colspan "1", :rowspan "1"} "Egypt:Country:Place"]
       [:td {:colspan "1", :rowspan "1"} "Egypt"]
       [:td {:colspan "1", :rowspan "1"} "Egypt"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "16"]
       [:td {:colspan "1", :rowspan "1"} "South_America:Continent:Place"]
       [:td {:colspan "1", :rowspan "1"} "South_America"]
       [:td {:colspan "1", :rowspan "1"} "South America"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "17"]
       [:td {:colspan "1", :rowspan "1"} "Bolivia:Country:Place"]
       [:td {:colspan "1", :rowspan "1"} "Bolivia"]
       [:td {:colspan "1", :rowspan "1"} "Bolivia"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "21"]
       [:td {:colspan "1", :rowspan "1"} "Turkey:Country:Place"]
       [:td {:colspan "1", :rowspan "1"} "Turkey"]
       [:td {:colspan "1", :rowspan "1"} "Turkey"]]]]))

(defn table-rel []
  (list
    [:table {:class "cell-border stripe", :id "tblRel"}
     [:thead
      [:tr
       [:th {:colspan "1", :rowspan "1", :class "cid"} "ID"]
       [:th {:colspan "1", :rowspan "1", :class "clabels"} "Labels"]
       [:th {:colspan "1", :rowspan "1", :class "cname"} "Name"]
       [:th {:colspan "1", :rowspan "1", :class "ctype"} "Rel. Type"]
       [:th {:colspan "1", :rowspan "1", :class "crleft"} "Name Left"]
       [:th {:colspan "1", :rowspan "1", :class "crright"} "Name Right"]]]
     [:tbody
      {}
      [:tr
       [:td {:colspan "1", :rowspan "1"} "0"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "from"]
       [:td {:colspan "1", :rowspan "1"} "Precessional_Era_of_Leo"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "1"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "in orbit around"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]
       [:td {:colspan "1", :rowspan "1"} "Sol"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "2"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "in"]
       [:td {:colspan "1", :rowspan "1"} "Sol"]
       [:td {:colspan "1", :rowspan "1"} "Milky_Way"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "3"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "in"]
       [:td {:colspan "1", :rowspan "1"} "Milky_Way"]
       [:td {:colspan "1", :rowspan "1"} "Universe"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "4"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "in"]
       [:td {:colspan "1", :rowspan "1"} "Universe"]
       [:td {:colspan "1", :rowspan "1"} "GOD"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "5"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "in"]
       [:td {:colspan "1", :rowspan "1"} "Adam_is_Created"]
       [:td {:colspan "1", :rowspan "1"} "Africa"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "6"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "on"]
       [:td {:colspan "1", :rowspan "1"} "Africa"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "7"]
       [:td {:colspan "1", :rowspan "1"} "INVOLVED"]
       [:td {:colspan "1", :rowspan "1"} "INVOLVED"]
       [:td {:colspan "1", :rowspan "1"} "with Event"]
       [:td {:colspan "1", :rowspan "1"} "Adam"]
       [:td {:colspan "1", :rowspan "1"} "Adam_is_Created"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "8"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "LOCATION"]
       [:td {:colspan "1", :rowspan "1"} "on"]
       [:td {:colspan "1", :rowspan "1"} "Middle_East"]
       [:td {:colspan "1", :rowspan "1"} "Earth"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "9"]
       [:td {:colspan "1", :rowspan "1"} "MARRIED"]
       [:td {:colspan "1", :rowspan "1"} "MARRIED"]
       [:td {:colspan "1", :rowspan "1"} "Husband"]
       [:td {:colspan "1", :rowspan "1"} "Adam_Ben_YHWH"]
       [:td {:colspan "1", :rowspan "1"} "Eve_Isha_Adam"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "10"]
       [:td {:colspan "1", :rowspan "1"} "FATHER"]
       [:td {:colspan "1", :rowspan "1"} "FATHER"]
       [:td {:colspan "1", :rowspan "1"} "to son"]
       [:td {:colspan "1", :rowspan "1"} "Adam_Ben_YHWH"]
       [:td {:colspan "1", :rowspan "1"} "Seth_Ben_Adam"]]
      [:tr
       [:td {:colspan "1", :rowspan "1"} "11"]
       [:td {:colspan "1", :rowspan "1"} "MOTHER"]
       [:td {:colspan "1", :rowspan "1"} "MOTHER"]
       [:td {:colspan "1", :rowspan "1"} "to son"]
       [:td {:colspan "1", :rowspan "1"} "Eve_Isha_Adam"]
       [:td {:colspan "1", :rowspan "1"} "Seth_Ben_Adam"]]]]))

(defn pageContent []
  (pctabs)
  [:div {:class "tab-content"}
   [:div {:class "tab-pane active datascroll", :id "one"} (table-events)]
   [:div {:class "tab-pane datascroll", :id "two"} (table-people)]
   [:div {:class "tab-pane", :id "three"} (tables-places)]
   [:div {:class "tab-pane", :id "four"} (table-rel)]])

(defn page
  "Index/Browse Page for History of the World.
  Argument(s): NONE"
  []
  (hcore/html
    (hic/html5 {:lang "en"}
      (snippets/head "index" "Dot Net II: History of the World: Browse")
       [:body
        [:div {:class "container"}
         ;; Load the Bootstrap 3 responsive menu
         (menu/playmenu "index")
         [:div {:class "row", :id "contentRow"}
          [:div {:class "col-md-12"}
           (pageContent)]]
         [:div {:class "row", :id "footerRow"}
          [:div {:class "col-md-6"} (snippets/statuspanel)]
          [:div {:class "col-md-6"} (snippets/socialmediapanel)]]]
        (snippets/loadjsscripts "chart")])))
