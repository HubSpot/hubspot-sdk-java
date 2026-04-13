// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.cms.BatchInputJsonNode
import com.hubspot.sdk.models.cms.PublicAccessRule
import com.hubspot.sdk.models.cms.pages.BatchInputContentFolder
import com.hubspot.sdk.models.cms.pages.BatchInputPage
import com.hubspot.sdk.models.cms.pages.ContentFolder
import com.hubspot.sdk.models.cms.pages.PageData
import com.hubspot.sdk.models.cms.pages.batch.BatchGetLandingPagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchGetSitePagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchUpdateFoldersParams
import com.hubspot.sdk.models.cms.pages.batch.BatchUpdateLandingPagesParams
import com.hubspot.sdk.models.cms.pages.batch.BatchUpdateSitePagesParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFolders() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        val batchResponseContentFolder =
            batchService.createFolders(
                BatchInputContentFolder.builder()
                    .addInput(
                        ContentFolder.builder()
                            .id("id")
                            .category(0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .name("name")
                            .parentFolderId(0L)
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        batchResponseContentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createLandingPages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        val batchResponsePage =
            batchService.createLandingPages(
                BatchInputPage.builder()
                    .addInput(
                        PageData.builder()
                            .id("id")
                            .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                            .abTestId("abTestId")
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .archivedInDashboard(true)
                            .addAttachedStylesheet(
                                PageData.AttachedStylesheet.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .authorName("authorName")
                            .campaign("campaign")
                            .categoryId(0)
                            .contentGroupId("contentGroupId")
                            .contentTypeCategory(PageData.ContentTypeCategory._0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdById("createdById")
                            .currentlyPublished(true)
                            .currentState(PageData.CurrentState.AGENT_GENERATED)
                            .domain("domain")
                            .dynamicPageDataSourceId("dynamicPageDataSourceId")
                            .dynamicPageDataSourceType(0)
                            .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                            .enableDomainStylesheets(true)
                            .enableLayoutStylesheets(true)
                            .featuredImage("featuredImage")
                            .featuredImageAltText("featuredImageAltText")
                            .folderId("folderId")
                            .footerHtml("footerHtml")
                            .headHtml("headHtml")
                            .htmlTitle("htmlTitle")
                            .includeDefaultCustomCss(true)
                            .language(PageData.Language.AA)
                            .layoutSections(
                                PageData.LayoutSections.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "cells" to listOf<Any>(),
                                                "cssClass" to "cssClass",
                                                "cssId" to "cssId",
                                                "cssStyle" to "cssStyle",
                                                "label" to "label",
                                                "name" to "name",
                                                "params" to mapOf("foo" to mapOf<String, Any>()),
                                                "rowMetaData" to
                                                    listOf(
                                                        mapOf(
                                                            "cssClass" to "cssClass",
                                                            "styles" to
                                                                mapOf(
                                                                    "backgroundColor" to
                                                                        mapOf(
                                                                            "a" to 0,
                                                                            "b" to 0,
                                                                            "g" to 0,
                                                                            "r" to 0,
                                                                        ),
                                                                    "backgroundGradient" to
                                                                        mapOf(
                                                                            "angle" to
                                                                                mapOf(
                                                                                    "units" to
                                                                                        "deg",
                                                                                    "value" to 0,
                                                                                ),
                                                                            "colors" to
                                                                                listOf(
                                                                                    mapOf(
                                                                                        "color" to
                                                                                            mapOf(
                                                                                                "a" to
                                                                                                    0,
                                                                                                "b" to
                                                                                                    0,
                                                                                                "g" to
                                                                                                    0,
                                                                                                "r" to
                                                                                                    0,
                                                                                            )
                                                                                    )
                                                                                ),
                                                                            "sideOrCorner" to
                                                                                mapOf(
                                                                                    "horizontalSide" to
                                                                                        "CENTER",
                                                                                    "verticalSide" to
                                                                                        "BOTTOM",
                                                                                ),
                                                                        ),
                                                                    "backgroundImage" to
                                                                        mapOf(
                                                                            "backgroundPosition" to
                                                                                "backgroundPosition",
                                                                            "backgroundSize" to
                                                                                "backgroundSize",
                                                                            "imageUrl" to "imageUrl",
                                                                        ),
                                                                    "flexboxPositioning" to
                                                                        "BOTTOM_CENTER",
                                                                    "forceFullWidthSection" to true,
                                                                    "maxWidthSectionCentering" to 0,
                                                                    "verticalAlignment" to "BOTTOM",
                                                                    "breakpointStyles" to
                                                                        mapOf(
                                                                            "foo" to
                                                                                mapOf(
                                                                                    "hidden" to
                                                                                        true,
                                                                                    "margin" to
                                                                                        mapOf(
                                                                                            "bottom" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "top" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                        ),
                                                                                    "padding" to
                                                                                        mapOf(
                                                                                            "bottom" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "left" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "right" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "top" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                        ),
                                                                                )
                                                                        ),
                                                                ),
                                                        )
                                                    ),
                                                "rows" to listOf(mapOf<String, Any>()),
                                                "styles" to
                                                    mapOf(
                                                        "backgroundColor" to
                                                            mapOf(
                                                                "a" to 0,
                                                                "b" to 0,
                                                                "g" to 0,
                                                                "r" to 0,
                                                            ),
                                                        "backgroundGradient" to
                                                            mapOf(
                                                                "angle" to
                                                                    mapOf(
                                                                        "units" to "deg",
                                                                        "value" to 0,
                                                                    ),
                                                                "colors" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "color" to
                                                                                mapOf(
                                                                                    "a" to 0,
                                                                                    "b" to 0,
                                                                                    "g" to 0,
                                                                                    "r" to 0,
                                                                                )
                                                                        )
                                                                    ),
                                                                "sideOrCorner" to
                                                                    mapOf(
                                                                        "horizontalSide" to
                                                                            "CENTER",
                                                                        "verticalSide" to "BOTTOM",
                                                                    ),
                                                            ),
                                                        "backgroundImage" to
                                                            mapOf(
                                                                "backgroundPosition" to
                                                                    "backgroundPosition",
                                                                "backgroundSize" to
                                                                    "backgroundSize",
                                                                "imageUrl" to "imageUrl",
                                                            ),
                                                        "flexboxPositioning" to "BOTTOM_CENTER",
                                                        "forceFullWidthSection" to true,
                                                        "maxWidthSectionCentering" to 0,
                                                        "verticalAlignment" to "BOTTOM",
                                                        "breakpointStyles" to
                                                            mapOf(
                                                                "foo" to
                                                                    mapOf(
                                                                        "hidden" to true,
                                                                        "margin" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
                                                                        "padding" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "left" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "right" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
                                                                    )
                                                            ),
                                                    ),
                                                "type" to "type",
                                                "w" to 0,
                                                "x" to 0,
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .linkRelCanonicalUrl("linkRelCanonicalUrl")
                            .mabExperimentId("mabExperimentId")
                            .metaDescription("metaDescription")
                            .name("name")
                            .pageExpiryDate(0L)
                            .pageExpiryEnabled(true)
                            .pageExpiryRedirectId(0L)
                            .pageExpiryRedirectUrl("pageExpiryRedirectUrl")
                            .pageRedirected(true)
                            .password("password")
                            .addPublicAccessRule(PublicAccessRule.builder().build())
                            .publicAccessRulesEnabled(true)
                            .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .publishImmediately(true)
                            .slug("slug")
                            .state("state")
                            .subcategory("subcategory")
                            .templatePath("templatePath")
                            .themeSettingsValues(
                                PageData.ThemeSettingsValues.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .translatedFromId("translatedFromId")
                            .translations(
                                PageData.Translations.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "id" to 0,
                                                "archivedInDashboard" to true,
                                                "authorName" to "authorName",
                                                "campaign" to "campaign",
                                                "campaignName" to "campaignName",
                                                "created" to "2019-12-27T18:11:19.117Z",
                                                "name" to "name",
                                                "password" to "password",
                                                "publicAccessRules" to listOf(mapOf<String, Any>()),
                                                "publicAccessRulesEnabled" to true,
                                                "publishDate" to "2019-12-27T18:11:19.117Z",
                                                "slug" to "slug",
                                                "state" to "state",
                                                "updated" to "2019-12-27T18:11:19.117Z",
                                                "tagIds" to listOf(0),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedById("updatedById")
                            .url("url")
                            .useFeaturedImage(true)
                            .widgetContainers(
                                PageData.WidgetContainers.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgets(
                                PageData.Widgets.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponsePage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createSitePages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        val batchResponsePage =
            batchService.createSitePages(
                BatchInputPage.builder()
                    .addInput(
                        PageData.builder()
                            .id("id")
                            .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                            .abTestId("abTestId")
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .archivedInDashboard(true)
                            .addAttachedStylesheet(
                                PageData.AttachedStylesheet.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .authorName("authorName")
                            .campaign("campaign")
                            .categoryId(0)
                            .contentGroupId("contentGroupId")
                            .contentTypeCategory(PageData.ContentTypeCategory._0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdById("createdById")
                            .currentlyPublished(true)
                            .currentState(PageData.CurrentState.AGENT_GENERATED)
                            .domain("domain")
                            .dynamicPageDataSourceId("dynamicPageDataSourceId")
                            .dynamicPageDataSourceType(0)
                            .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                            .enableDomainStylesheets(true)
                            .enableLayoutStylesheets(true)
                            .featuredImage("featuredImage")
                            .featuredImageAltText("featuredImageAltText")
                            .folderId("folderId")
                            .footerHtml("footerHtml")
                            .headHtml("headHtml")
                            .htmlTitle("htmlTitle")
                            .includeDefaultCustomCss(true)
                            .language(PageData.Language.AA)
                            .layoutSections(
                                PageData.LayoutSections.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "cells" to listOf<Any>(),
                                                "cssClass" to "cssClass",
                                                "cssId" to "cssId",
                                                "cssStyle" to "cssStyle",
                                                "label" to "label",
                                                "name" to "name",
                                                "params" to mapOf("foo" to mapOf<String, Any>()),
                                                "rowMetaData" to
                                                    listOf(
                                                        mapOf(
                                                            "cssClass" to "cssClass",
                                                            "styles" to
                                                                mapOf(
                                                                    "backgroundColor" to
                                                                        mapOf(
                                                                            "a" to 0,
                                                                            "b" to 0,
                                                                            "g" to 0,
                                                                            "r" to 0,
                                                                        ),
                                                                    "backgroundGradient" to
                                                                        mapOf(
                                                                            "angle" to
                                                                                mapOf(
                                                                                    "units" to
                                                                                        "deg",
                                                                                    "value" to 0,
                                                                                ),
                                                                            "colors" to
                                                                                listOf(
                                                                                    mapOf(
                                                                                        "color" to
                                                                                            mapOf(
                                                                                                "a" to
                                                                                                    0,
                                                                                                "b" to
                                                                                                    0,
                                                                                                "g" to
                                                                                                    0,
                                                                                                "r" to
                                                                                                    0,
                                                                                            )
                                                                                    )
                                                                                ),
                                                                            "sideOrCorner" to
                                                                                mapOf(
                                                                                    "horizontalSide" to
                                                                                        "CENTER",
                                                                                    "verticalSide" to
                                                                                        "BOTTOM",
                                                                                ),
                                                                        ),
                                                                    "backgroundImage" to
                                                                        mapOf(
                                                                            "backgroundPosition" to
                                                                                "backgroundPosition",
                                                                            "backgroundSize" to
                                                                                "backgroundSize",
                                                                            "imageUrl" to "imageUrl",
                                                                        ),
                                                                    "flexboxPositioning" to
                                                                        "BOTTOM_CENTER",
                                                                    "forceFullWidthSection" to true,
                                                                    "maxWidthSectionCentering" to 0,
                                                                    "verticalAlignment" to "BOTTOM",
                                                                    "breakpointStyles" to
                                                                        mapOf(
                                                                            "foo" to
                                                                                mapOf(
                                                                                    "hidden" to
                                                                                        true,
                                                                                    "margin" to
                                                                                        mapOf(
                                                                                            "bottom" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "top" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                        ),
                                                                                    "padding" to
                                                                                        mapOf(
                                                                                            "bottom" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "left" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "right" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                            "top" to
                                                                                                mapOf(
                                                                                                    "units" to
                                                                                                        "%",
                                                                                                    "value" to
                                                                                                        0,
                                                                                                ),
                                                                                        ),
                                                                                )
                                                                        ),
                                                                ),
                                                        )
                                                    ),
                                                "rows" to listOf(mapOf<String, Any>()),
                                                "styles" to
                                                    mapOf(
                                                        "backgroundColor" to
                                                            mapOf(
                                                                "a" to 0,
                                                                "b" to 0,
                                                                "g" to 0,
                                                                "r" to 0,
                                                            ),
                                                        "backgroundGradient" to
                                                            mapOf(
                                                                "angle" to
                                                                    mapOf(
                                                                        "units" to "deg",
                                                                        "value" to 0,
                                                                    ),
                                                                "colors" to
                                                                    listOf(
                                                                        mapOf(
                                                                            "color" to
                                                                                mapOf(
                                                                                    "a" to 0,
                                                                                    "b" to 0,
                                                                                    "g" to 0,
                                                                                    "r" to 0,
                                                                                )
                                                                        )
                                                                    ),
                                                                "sideOrCorner" to
                                                                    mapOf(
                                                                        "horizontalSide" to
                                                                            "CENTER",
                                                                        "verticalSide" to "BOTTOM",
                                                                    ),
                                                            ),
                                                        "backgroundImage" to
                                                            mapOf(
                                                                "backgroundPosition" to
                                                                    "backgroundPosition",
                                                                "backgroundSize" to
                                                                    "backgroundSize",
                                                                "imageUrl" to "imageUrl",
                                                            ),
                                                        "flexboxPositioning" to "BOTTOM_CENTER",
                                                        "forceFullWidthSection" to true,
                                                        "maxWidthSectionCentering" to 0,
                                                        "verticalAlignment" to "BOTTOM",
                                                        "breakpointStyles" to
                                                            mapOf(
                                                                "foo" to
                                                                    mapOf(
                                                                        "hidden" to true,
                                                                        "margin" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
                                                                        "padding" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "left" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "right" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "%",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
                                                                    )
                                                            ),
                                                    ),
                                                "type" to "type",
                                                "w" to 0,
                                                "x" to 0,
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .linkRelCanonicalUrl("linkRelCanonicalUrl")
                            .mabExperimentId("mabExperimentId")
                            .metaDescription("metaDescription")
                            .name("name")
                            .pageExpiryDate(0L)
                            .pageExpiryEnabled(true)
                            .pageExpiryRedirectId(0L)
                            .pageExpiryRedirectUrl("pageExpiryRedirectUrl")
                            .pageRedirected(true)
                            .password("password")
                            .addPublicAccessRule(PublicAccessRule.builder().build())
                            .publicAccessRulesEnabled(true)
                            .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .publishImmediately(true)
                            .slug("slug")
                            .state("state")
                            .subcategory("subcategory")
                            .templatePath("templatePath")
                            .themeSettingsValues(
                                PageData.ThemeSettingsValues.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .translatedFromId("translatedFromId")
                            .translations(
                                PageData.Translations.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "id" to 0,
                                                "archivedInDashboard" to true,
                                                "authorName" to "authorName",
                                                "campaign" to "campaign",
                                                "campaignName" to "campaignName",
                                                "created" to "2019-12-27T18:11:19.117Z",
                                                "name" to "name",
                                                "password" to "password",
                                                "publicAccessRules" to listOf(mapOf<String, Any>()),
                                                "publicAccessRulesEnabled" to true,
                                                "publishDate" to "2019-12-27T18:11:19.117Z",
                                                "slug" to "slug",
                                                "state" to "state",
                                                "updated" to "2019-12-27T18:11:19.117Z",
                                                "tagIds" to listOf(0),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedById("updatedById")
                            .url("url")
                            .useFeaturedImage(true)
                            .widgetContainers(
                                PageData.WidgetContainers.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgets(
                                PageData.Widgets.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponsePage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteFolders() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        batchService.deleteFolders(BatchInputString.builder().addInput("string").build())
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteLandingPages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        batchService.deleteLandingPages(BatchInputString.builder().addInput("string").build())
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteSitePages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        batchService.deleteSitePages(BatchInputString.builder().addInput("string").build())
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        val batchResponsePage =
            batchService.getLandingPages(
                BatchGetLandingPagesParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponsePage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSitePages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        val batchResponsePage =
            batchService.getSitePages(
                BatchGetSitePagesParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponsePage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFolders() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        val batchResponseContentFolder =
            batchService.updateFolders(
                BatchUpdateFoldersParams.builder()
                    .archived(true)
                    .batchInputJsonNode(
                        BatchInputJsonNode.builder()
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        batchResponseContentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateLandingPages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        val batchResponsePage =
            batchService.updateLandingPages(
                BatchUpdateLandingPagesParams.builder()
                    .archived(true)
                    .batchInputJsonNode(
                        BatchInputJsonNode.builder()
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        batchResponsePage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateSitePages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().pages().batch()

        val batchResponsePage =
            batchService.updateSitePages(
                BatchUpdateSitePagesParams.builder()
                    .archived(true)
                    .batchInputJsonNode(
                        BatchInputJsonNode.builder()
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        batchResponsePage.validate()
    }
}
