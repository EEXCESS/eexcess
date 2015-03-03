![EEXCESS](http://eexcess.eu/wp-content/uploads/2013/04/eexcess_Logo_neu1.jpg "EEXCESS")
=======

This is the Github repositoryr of the EU-funded project [EEXCESS](http://eexcess.eu/ "EEXCESS").

# Overview

EEXCESS develops open source software for augmenting web channels like web sites or social networks with cultural heritage and scholarly content. It consists of several sub-projects that combine into a privacy-preserving, personalized recommendataion service for cultural heritage and scholalry content. It consists of the following components:

1. A federated recommender system, that recommends resources from distributed cultural heritage and scholarly data providers. Recommendations are personalized on the one hand, but also privacy-preserving on the other hand. Besides the federated recommendataion, we also provide tools for data mapping based on Semantic Web standards and for privacy-perservation.

2. Client-side augmentation and visualisation technologies to inject cultural heritage and scholarly content into habitually used user channels. This includes injecting recommendations into HTML 5 pages, into content management systems, into Google Apps for Works and into social networks like Twitter. 

3. Several proof-of-concept that take up additional usage routes for cultural heritage and scholarly content. For example, a [Cultural Heritage Game with a Purpose (CGWAP)](http://cgwap.lisawagner.li/CGWAP/) as well as an Android App.


The project is currently under development, so not all functionality is realised yet. Below you can find more details on the architecture and furhter information on the source code managment/components. If you have any qeustion, idea or issue, please get in contact with us.


# Architecture



# Source Code Management

The EEXCESS source is organised in [Git submodules](http://git-scm.com/book/en/v2/Git-Tools-Submodules). So every individual sub-module maintains its own  Git repository and also provides a standalone solution. This EEXCESS main repositories brings all the parts together.

## Client Side Technologies

1. The [Wordpress Plugin](https://github.com/EEXCESS/wordpress-plugin) for recommending cultural and scholarly content while editing a Wordpress blog. It is foreseen to deploy the Wordpress Plugin Directory.

2. The [Google Chrome Extension](http://purl.org/eexcess/components/chrome-extension) for recommending cultural and scholarly content while browsing the web. The Extension is also available through the [Chrome Web Store](https://chrome.google.com/webstore/detail/eexcess/mnicfonfoiffhekefgjlaihcpnbchdbc).



## Proof-of-Concept

1. A [Cultural Game with a Purpose (CGWAP)](https://github.com/EEXCESS/cgwap)


# Documentation









