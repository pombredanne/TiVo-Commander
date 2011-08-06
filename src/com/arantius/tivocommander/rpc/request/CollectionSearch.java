/*
TiVo Commander allows control of a TiVo Premiere device.
Copyright (C) 2011  Anthony Lieuallen (arantius@gmail.com)

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License along
with this program; if not, write to the Free Software Foundation, Inc.,
51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/

package com.arantius.tivocommander.rpc.request;

public class CollectionSearch extends BaseSearch {
  protected final String mImageRulesetJson =
      "[{\"type\":\"imageRuleset\",\"name\":\"movie\",\"rule\":[{\"type\":\"imageRule\",\"width\":133,\"ruleType\":\"exactMatchDimension\",\"imageType\":[\"moviePoster\"],\"height\":200}]},{\"type\":\"imageRuleset\",\"name\":\"tvLandscape\",\"rule\":[{\"type\":\"imageRule\",\"width\":139,\"ruleType\":\"exactMatchDimension\",\"imageType\":[\"showcaseBanner\"],\"height\":104}]},{\"type\":\"imageRuleset\",\"name\":\"tvPortrait\",\"rule\":[{\"type\":\"imageRule\",\"width\":200,\"ruleType\":\"exactMatchDimension\",\"imageType\":[\"showcaseBanner\"],\"height\":150}]}]";
  protected final String[] mNote = new String[] { "userContentForCollectionId",
      "broadbandOfferGroupForCollectionId",
      "broadcastOfferGroupForCollectionId" };
  protected final String mResponseTemplateJson =
      "[{\"type\":\"responseTemplate\",\"fieldName\":[\"subscriptionType\"],\"typeName\":\"subscriptionIdentifier\"},{\"type\":\"responseTemplate\",\"fieldName\":[\"state\",\"recordingId\",\"subscriptionIdentifier\"],\"typeName\":\"recording\"},{\"type\":\"responseTemplate\",\"fieldName\":[\"partnerId\",\"contentId\"],\"typeName\":\"offer\"},{\"type\":\"responseTemplate\",\"fieldName\":[\"collection\"],\"typeName\":\"collectionList\"},{\"type\":\"responseTemplate\",\"fieldInfo\":[{\"type\":\"responseTemplateFieldInfo\",\"maxArity\":[50],\"fieldName\":[\"credit\"]},{\"type\":\"responseTemplateFieldInfo\",\"maxArity\":[2],\"fieldName\":[\"category\"]}],\"fieldName\":[\"broadbandOfferGroupForCollectionId\",\"broadcastOfferGroupForCollectionId\",\"collectionId\",\"collectionType\",\"hdtv\",\"title\",\"movieYear\",\"episodic\",\"starRating\",\"description\",\"tvRating\",\"mpaaRating\",\"category\",\"credit\",\"userContentForCollectionId\",\"image\"],\"typeName\":\"collection\"},{\"type\":\"responseTemplate\",\"fieldName\":[\"example\"],\"typeName\":\"offerGroup\"},{\"type\":\"responseTemplate\",\"fieldName\":[\"first\",\"last\",\"role\"],\"typeName\":\"credit\"},{\"type\":\"responseTemplate\",\"fieldName\":[\"displayRank\",\"image\"],\"typeName\":\"category\"},{\"type\":\"responseTemplate\",\"fieldName\":[\"thumbsRating\"],\"typeName\":\"userContent\"},{\"type\":\"responseTemplate\",\"fieldName\":[\"channelNumber\",\"sourceType\",\"logoIndex\",\"callSign\",\"isDigital\"],\"typeName\":\"channel\"}]";

  /** Produces an idSequence of shows for the given folder, all if null. */
  public CollectionSearch(String collectionId) {
    super(collectionId, null);
    addCommon(mImageRulesetJson, mNote, mResponseTemplateJson);
  }
}
