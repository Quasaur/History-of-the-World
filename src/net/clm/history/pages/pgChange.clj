(ns ^{:author "Calvin L. Mitchell"
      :doc "Changelog page for History of the World."}
    net.clm.history.pages.pgChange
  (:require [hiccup.core :as hcore]
            [hiccup.page :as hic]
            [net.clm.history.pages.snippets :as snippets]
            [net.clm.history.pages.menus :as menus]))

(defn pageContent []
  (list
    [:div {:id "clg"}
     [:p [:strong "05-September-2015:"] "New Site Phase Two: Converted clojure web app to Bootstrap3 for responsive web pages. Next Phase: begin conversion to Neo4j-based database."]
     [:p [:strong "17-August-2015:"] "New Site Phase One: Converted app to clojure. Next phase on roadmap is to switch to Bootstrap3 for responsive web pages."]
     [:p [:strong "10-April-2012:"] " Using Google Docs, Fusion Tables, App Script and UI Forms, Browse, Add and Map tabs are resurrected. History-of-the-World is commited to GitHub.com"]
     [:p [:strong "18-May-2011:"] " DabbleDB, having been bought by Twitter, is closed. Browse, Add & Map tabs go blank."]
     [:p [:strong "31-Oct-2010:"] " Completed captions and artwork for Chart tab." [:br {:clear "none"}]
      [:strong "11-Oct-2010:"] " Began adding Changelog txt as new tab to separate History from main.clmitchell.net. Formatting html for changelog page. Removed ChangeLog link from Links Tab."]
     [:p [:strong "12-Sep-2010:"] " new Google Analytics Profile for history.clmitchell.net" [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "02-Sep-2010:"] " Changed Type Building to Construction" [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "01-Sep-2010:"] " Added Computer History Timeline to Links Tab."]
     [:p [:strong "27-Aug-2010:"] " Added google analytics script to all pages."]
     [:p [:strong "July-2010:"] " Continuing to tweek class.jsonFile.php to make JSON file compatible with timeline. Created mechanism to escape quotes in description (still have problems with line returns...can fix that in the database itself). Able to load limited amount of data into timeline. Need to remove decimals from Greg. years before Timeline can process...started function to remove them." [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "04-Jul-2010:"] " The History of the World SIMILE Timeline chart is (for all intent and purpose) up and running! Next Step? Customizing icons...adding all the captions...adding the ability to filter by event type...still restoring weblinks. Added Paul's Letter to the Romans (58 A.D.)." [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "13-Jul-2010:"] " Enhanced Chart Tab bubble to include Caption, Region and placeholder for upcoming images!" [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "14-Jul-2010:"] " Setup state flags as image placeholders for most events." [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "17-Jul-2010:"] " Style Updates; Doc updates. Time to put live._oldjs where it belongs." [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "18-Jul-2010:"] " Improved the code to render the Timeline Bubble." [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "21-Jul-2010:"] " Experimenting with trackNum and trying a 3rd band for decade. Added some more color." [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "22-Jul-2010:"] " Decided to restrain image size to 150px and to place resized images on website." [:br {:clear "none"}] [:br {:clear "none"}]
      [:strong "25-Jul-2010:"] " Successfully exported DabbleDB history dbase to MySQL."]
     [:p [:strong "June-2010:"] " Started coding utilty to convert Dabble CSV export to SIMILE Timeline JSON file; created ./utils directory for files. Added the Invention of Terra Preta (450 BC - 950 AD). Added more documentation." [:br {:clear "none"}] [:br {:clear "none"}]
      "\n\nAdded the Kushan Empire (30 BC - 225 AD). Testing new CSV reader: b3rtCSVReader...parses test.csv perfectly! class.jsonFile.php works perfectly, convert.php virtually complete...problems with Timeline library handling BC dates with 5 places (i.e., \"-10847\")."]
     [:p [:strong "May-2010:"] " Adopted Dabble platform for new version of database (historyclm.dabbledb.com). deleted sug.php and man.php; renamed cha.php map.php; removed Accordion on Browse Events and inserted dabble page for default view; expanded width of dsContents, etc. Loaded shared Dabble pages for default view and Add Entry form. Brought back original view of local database (not work)." [:br {:clear "none"}] [:br {:clear "none"}]
      "\n\nDabbleDB doesn't allow for sql queries; to change multiple records I have to export the data to an excel spreadsheet and massage it there. Unfortunately, in doing so all the views and shared pages I've created become obsolete. Another consequence is that now I have to rebuild all the web links." [:br {:clear "none"}] [:br {:clear "none"}]
      "\n\nAdded pages for Docs and Links. Update link to Changelog on main site. Recognized need to modify custom Spry _oldjs files for changes to controls and layouts. Removed custom data code from index.php. Dont need Spry anymore...removing it. CSS adjustments. Corrected BibleTime link. Continuing documentation devel." [:br {:clear "none"}] [:br {:clear "none"}]
      "\n\nDid a little code cleanup on add.php. Setup iframe for Map - World. Added \"Contact Us\" to Seek page. Continuing documentation devel." [:br {:clear "none"}] [:br {:clear "none"}]
      "\n\nAdded html4-strict.inc, histtl._oldjs. Added base Timeline to cha.php...just need data now. Continuing divDoc.inc update. Updated timeline_js._oldjs to point to local copy of simile-ajax-api._oldjs. For some reason cha.php works fine on test server but not on bluehost (solved: permissions)." [:br {:clear "none"}] [:br {:clear "none"}]
      "\n\nAdded \"The Colored Patriots of the American Revolution\" to Americas\\Literature."] [:p [:strong "May-2009:"] " Added founding of Lamanai (-1500)."] [:p [:strong "Mar-2009:"] " Added Atra-Hasis (-1650), the Nebra Sky Disk and Epic of Gilgamesh (1600), Transit of Venus (-920, -912)."]
     [:p [:strong "Feb-2009:"] " Added En?ma Eli� and Phaistos Disc (-1700)."]
     [:p [:strong "Jan-2009:"] " Added the Greek Parthenon. Added the calendar change of -762 BC, Added The Destruction of Carthage (-146) and the -0920 Transit of Venus."]
     [:p [:strong "Dec-2008:"] " Added The Great New Madrid Earthquakes (1811, 1812),"]
     [:p [:strong "Nov-2008:"] " Added Sima Qian's  Taichuli calendar and Records of the Grand Historian (-104, -91), Added St. Basi'ls Cathetral (1555, 1561) and the Rus' Primary Chronicle (1116), Added Joan of Arc (1412, 1431), Camille Saint-Sa?ns (1835, 1921) and Franz Schubert (1797, 1823). Added Fibonacci (1170-1250), Codex Regius (1279)."]
     [:p [:strong "Sep-2008:"] " Added construction of the Forbidden city (1406, 1420). Added Death of Xinzhui, arguably the most well-preserved mummy in history (-168, 1972). Corrected link for Changelog."] [:p [:strong "Aug-2008:"] " Added Birth/Death of Tamerlane (1336-1405). Added the demo of Morse's telegraph in 1844. Added the arrival of slaves at Jamestown, VA in 1619 (creating a new event type: \"Slavery\"). Added the birth/death of Pakal in A.D. 603/683.  Added the Fall of Tayasal in 1697. Made corrections to Bible date 10879 (changed \"109\" to \"-109\" and Gregorian date 1618 (Changed \"18-Spe-1618\" to \"18-Sep-1618\")"]
     [:p [:strong "26-Feb-2008:"] " The Add Events Form is visually complete, though pressing the Submit Event Suggestion button won't do anything--yet. I'm using reCAPTCHA for human authentication...when you use it you'll be digitizing books--a good cause. Before I make the form actually work I need to straighten out some style and javascript issues with the Spry Framework and IE6+; Though it is apparent that Spry does work with IE6+ the Spry developers seem satisfied to either bury the IE nuances somewhere deep in the Spry documentation or not mentiion them at all. In any case your patience is appreciated as I work out the kinks."]
     [:p [:strong "Jan-2008:"] " Created separate style sheet for Internet Explorer. Trying to figure out why field repopulation doesn't work under Internet Explorer."]
     [:p [:strong "Dec-2007:"] " Filter fields are repopulated with data from the last search. The Jubilee, ERA START and ERA END Event Types have been folden into the Calendar Event Type. A pager has been added to the History currently in production. My thanks to Joe O'Donnell for his paging class RecNav which I have modified for the History." [:br {:clear "none"}]
      "\n\nI also thank Vikram Vaswani for his article on sessions. In the course of developing a new version of my History I found the time to optimize and improve the PHP code for the current production version. Now any combination of filters can be used. The code has also been significantly optimized for efficiency (there's also a lot less of it to load). If the release date of the new version continues to recede, I will install a pager for the current production version. Thank you all for your patience and support.\n"]]))

(defn page
      "Changelog Page for History of the World.
      Argument(s): NONE"
      []
      (hcore/html
        (hic/html5
        (snippets/head "change" "Dot Net II: History of the World: Changelog")
        [:body
         [:div {:class "container"}
          ;; Load the Bootstrap 3 responsive menu
          (menus/playmenu "change")
          [:div {:class "row", :id "contentRow"}
           [:div {:class "col-md-12"}
            [:div {:class "tab-content datascroll"}
             (pageContent)]]]
          [:div {:class "row", :id "footerRow"}
           [:div {:class "col-md-6"} (snippets/statuspanel)]
           [:div {:class "col-md-6"} (snippets/socialmediapanel)]]]
         (snippets/loadjsscripts "change")])))
