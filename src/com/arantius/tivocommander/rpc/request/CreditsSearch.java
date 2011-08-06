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

public class CreditsSearch extends BaseSearch {
  // TODO: Make this format less verbose about all the image choices.
  protected final String mImageRulesetJson =
      "[{\"type\": \"imageRuleset\", \"name\": \"personPortrait\", \"rule\": [{\"width\": 113, \"ruleType\": \"exactMatchDimension\", \"type\": \"imageRule\", \"imageType\": [\"person\"], \"height\": 150}]}]";
  protected final String[] mNote = new String[] {};
  protected final String mResponseTemplateCollJson =
      "[{\"type\": \"responseTemplate\", \"fieldName\": [\"collection\"], \"typeName\": \"collectionList\"}, {\"fieldInfo\": [{\"maxArity\": [50], \"fieldName\": [\"credit\"], \"type\": \"responseTemplateFieldInfo\"}], \"fieldName\": [               \"collectionId\", \"collectionType\", \"credit\", \"title\"], \"typeName\": \"collection\", \"type\": \"responseTemplate\"}, {\"type\": \"responseTemplate\", \"fieldName\": [\"first\", \"last\", \"role\", \"image\", \"personId\", \"characterName\"], \"typeName\": \"credit\"}]";
  protected final String mResponseTemplateContJson =
      "[{\"type\": \"responseTemplate\", \"fieldName\": [\"content\"],    \"typeName\": \"contentList\"   }, {\"fieldInfo\": [{\"maxArity\": [50], \"fieldName\": [\"credit\"], \"type\": \"responseTemplateFieldInfo\"}], \"fieldName\": [\"contentId\", \"collectionId\", \"collectionType\", \"credit\", \"title\"], \"typeName\": \"content\",    \"type\": \"responseTemplate\"}, {\"type\": \"responseTemplate\", \"fieldName\": [\"first\", \"last\", \"role\", \"image\", \"personId\", \"characterName\"], \"typeName\": \"credit\"}]";

  public CreditsSearch(String collectionId, String contentId) {
    super(collectionId, contentId);
    addCommon(mImageRulesetJson, mNote,
        collectionId != null ? mResponseTemplateCollJson
            : mResponseTemplateContJson);
  }
}
