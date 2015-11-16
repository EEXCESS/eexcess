![EEXCESS](http://eexcess.eu/wp-content/uploads/2013/04/eexcess_Logo_neu1.jpg "EEXCESS")
=======

This is the Github repository of the EU-funded project [EEXCESS](http://eexcess.eu/ "EEXCESS").

# Overview

EEXCESS develops open source software for augmenting web channels like web sites or social networks with cultural heritage and scholarly content. It consists of several sub-projects that combine into a privacy-preserving, personalized recommendation service for cultural heritage and scholarly content. It consists of the following components:

1. A [federated recommender system](https://github.com/EEXCESS/recommender), that recommends resources from distributed cultural heritage and scholarly data providers. Recommendations are personalized while at the same time retaining the user's privacy.  Besides the federated recommendation, we also provide tools for data mapping based on Semantic Web standards and for privacy-perservation (see the [Privacy Proxy](https://github.com/EEXCESS/privacy-proxy)).

2. A [Partner Wizard](https://github.com/EEXCESS/PartnerWizard) which allows to integrate new partner systems using a simple web-form. A partner system is a content provider which is used by the federated recommender to generate recommendations. So without coding you can integrate most search APIs. 

3. Client-side augmentation and visualisation technologies to inject cultural heritage and scholarly content into habitually used user channels. This includes injecting recommendations into [HTML pages via a Chrome Extension](http://purl.org/eexcess/components/chrome-extension), into content management systems like [Wordpress](http://purl.org/eexcess/components/wordpress-plugin), into [Google Apps for Works](http://purl.org/eexcess/components/googledocs-plugin), into [Learn Management Systems like Moodle]() and into social networks like [Twitter](http://purl.org/eexcess/components/twitter-bot).

4. Several proof-of-concepts that take up additional usage routes for cultural heritage and scholarly content. For example, a [Cultural Heritage Game with a Purpose (CGWAP)](http://cgwap.lisawagner.li/CGWAP/), an [Android App for recommending Europeana Content](https://github.com/EEXCESS/android-app) and an [Angular JS based pargraph injection called Jarvis](https://github.com/EEXCESS/jarvis).

The project is currently under development, so not all functionality is realised yet. Below you can find more details on the architecture and furhter information on the source code managment/components. If you have any qeustion, idea or issue, please get in contact with us.


# Data Sources

Currently the following data sources are intergrated into the Federated Recommender:

|Partner System|Objects|
|--------------|-------|
| [Europeana] (http://www.europeana.eu/portal/) | ca. 44 millionen cultural heritage objects|
| [ZBW's Econbiz] (https://www.econbiz.de/)| ca. 10 millionen publications in the field of Economics|
| [KIM - Museums in Baselland, Switzerland](https://www.kgportal.bl.ch/startseite)| 
| [Mendeley](http://mendeley.com/)| ca. 85 millionen publications|
| [Brockhaus Wissensserver](https://vi.brockhaus.de/)||
| [German National Library](http://www.dnb.de/EN/Home/home_node.html)| ca. 17.7 million publications|
| [Kierling]()||
| [Rijksmuseum](https://www.rijksmuseum.nl/en/api)|1 million objects|





# Architecture

![Architecture of the EEXCESS Framework](http://eexcess.github.io/img/EEXCESS-Architecture-2015.svg)

# Source Code Management

The EEXCESS source is organised in [Git submodules](http://git-scm.com/book/en/v2/Git-Tools-Submodules). So every individual sub-module maintains its own  Git repository and also provides a standalone solution. This EEXCESS main repositories brings all the parts together.

Note that when cloning the repo you need to init and update the submodule once:

    git clone https://github.com/EEXCESS/eexcess.git
    cd eexcess
    git submodule init
    git submodule update

Alternatively you can use '--recursive' as option

    git clone --recursive https://github.com/EEXCESS/eexcess.git

## Client-side Technologies

1. The [Wordpress Plugin](https://github.com/EEXCESS/wordpress-plugin) for recommending cultural and scholarly content while editing a Wordpress blog. It is foreseen to deploy the Wordpress Plugin Directory.


2. The [Google Chrome Extension](http://purl.org/eexcess/components/chrome-extension) for recommending cultural and scholarly content while browsing the web. The Extension is also available through the [Chrome Web Store](https://chrome.google.com/webstore/detail/eexcess/mnicfonfoiffhekefgjlaihcpnbchdbc).
<!-- TODO: Rename repository, decompose into submodules (especially the visualisations) -->

3. A [Twitter Bot](http://purl.org/eexcess/components/twitter-bot) recommending scholarly content to Twitter users. The bot listens to certain keywords and send recommendations to users. If a user starts following the Twitter Bot, she gets recommendations regularly.

4. A [Google Docs Plugin/App](http://purl.org/eexcess/components/googledocs-plugin) that allows to query for cultural and scholarly resources when writing a Google Docs document. For example, found images can be reused in the document (if they have an apropriate license) or citation can be inserted.

## Server-side Technologies

1. The [Federated Recommender](https://github.com/EEXCESS/recommender) queries  distributed partner recommenders and merges their results. Partner recommenders are available for collections of [Europeana](http://www.europeana.eu/portal/), [ZBW](http://www.zbw.eu/de/), [Collections Trust (via Europeana)](http://www.collectionstrust.org.uk/), [Wissenmedia's Brockhaus](http://www.brockhaus.de/) and [KBL-AMBL's KIM Portal](http://kim.sharepointhosting.ch/default.aspx).

<!-- TODO: Needs update of the README.md -->

2. The [Privacy Proxy](https://github.com/EEXCESS/privacy-proxy) serves as privacy ensuring filter for request to the federated recommender. The developed protocol ensures that user id and query are separated. Further, queries can be obfuscated to ensure a high degree of privacy while retaining recommender accuracy.

<!-- TODO: Add README.md and explain the basics of the proxy -->


## Supporting Technologies

1. Tools for [Data Quality Assurance](https://github.com/EEXCESS/data-quality).
2. Prototype for the [Blog Crawler](https://github.com/n-witt/BlogCrawler)
3. Prototype for the [Blog Analyzer](https://github.com/n-witt/DataAnalyzer)


## Proof-of-Concept

1. An [Android App](http://purl.org/eexcess/components/android-app) that recommends Europeana results based on your current location.

2. A [Cultural Game with a Purpose (CGWAP)](https://github.com/EEXCESS/cgwap) which allows players to ask and answer cultural questions. Answers have to be given as links and the goal is to be as fast as possible in finding the answer on Europeana.
<!-- TODO: Needs update of the README.md plus a reference to the ECIR Paper -->

## Visualisations and Widgets

1. The [FacetScape](https://github.com/EEXCESS/vis-facetscape) presents a visualisation widget usable for faceted browsing of cultural heritage resources. The visualisation can be used independently of the recommender framework.


# Documentation

Detailed descriptions are given in the individual components. The overall documentation is available in the [Wiki of this repository](https://github.com/EEXCESS/eexcess/wiki).


# Branching model

All contibutions shoud follow the best practice branching model, as oultined [here](http://nvie.com/posts/a-successful-git-branching-model/)

# Data Quality












