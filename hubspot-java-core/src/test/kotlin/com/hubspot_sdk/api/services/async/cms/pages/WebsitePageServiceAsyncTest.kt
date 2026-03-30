// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageGetParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebsitePageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val pageFuture =
            websitePageServiceAsync.create(
                Page.builder()
                    .id("id")
                    .abStatus(Page.AbStatus.AUTOMATED_LOSER_VARIANT)
                    .abTestId("abTestId")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedInDashboard(true)
                    .addAttachedStylesheet(
                        Page.AttachedStylesheet.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .authorName("authorName")
                    .campaign("campaign")
                    .categoryId(0)
                    .contentGroupId("contentGroupId")
                    .contentTypeCategory(Page.ContentTypeCategory._0)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdById("createdById")
                    .currentlyPublished(true)
                    .currentState(Page.CurrentState.AGENT_GENERATED)
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
                    .language(Page.Language.AA)
                    .layoutSections(
                        Page.LayoutSections.builder()
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
                                                    mapOf("a" to 0, "b" to 0, "g" to 0, "r" to 0),
                                                "backgroundGradient" to
                                                    mapOf(
                                                        "angle" to
                                                            mapOf("units" to "deg", "value" to 0),
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
                                                                "horizontalSide" to "CENTER",
                                                                "verticalSide" to "BOTTOM",
                                                            ),
                                                    ),
                                                "backgroundImage" to
                                                    mapOf(
                                                        "backgroundPosition" to
                                                            "backgroundPosition",
                                                        "backgroundSize" to "backgroundSize",
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
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                        "top" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                    ),
                                                                "padding" to
                                                                    mapOf(
                                                                        "bottom" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                        "left" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                        "right" to
                                                                            mapOf(
                                                                                "units" to "%",
                                                                                "value" to 0,
                                                                            ),
                                                                        "top" to
                                                                            mapOf(
                                                                                "units" to "%",
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
                        Page.ThemeSettingsValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .translatedFromId("translatedFromId")
                    .translations(
                        Page.Translations.builder()
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
                        Page.WidgetContainers.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .widgets(
                        Page.Widgets.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val page = pageFuture.get()
        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val pageFuture =
            websitePageServiceAsync.update(
                WebsitePageUpdateParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .page(
                        Page.builder()
                            .id("id")
                            .abStatus(Page.AbStatus.AUTOMATED_LOSER_VARIANT)
                            .abTestId("abTestId")
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .archivedInDashboard(true)
                            .addAttachedStylesheet(
                                Page.AttachedStylesheet.builder()
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
                            .contentTypeCategory(Page.ContentTypeCategory._0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdById("createdById")
                            .currentlyPublished(true)
                            .currentState(Page.CurrentState.AGENT_GENERATED)
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
                            .language(Page.Language.AA)
                            .layoutSections(
                                Page.LayoutSections.builder()
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
                                Page.ThemeSettingsValues.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .translatedFromId("translatedFromId")
                            .translations(
                                Page.Translations.builder()
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
                                Page.WidgetContainers.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgets(
                                Page.Widgets.builder()
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

        val page = pageFuture.get()
        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val pageFuture = websitePageServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val future =
            websitePageServiceAsync.delete(
                WebsitePageDeleteParams.builder().objectId("objectId").archived(true).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun clone() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val pageFuture =
            websitePageServiceAsync.clone(
                ContentCloneRequestVNext.builder().id("id").cloneName("cloneName").build()
            )

        val page = pageFuture.get()
        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val pageFuture =
            websitePageServiceAsync.get(
                WebsitePageGetParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .property("property")
                    .build()
            )

        val page = pageFuture.get()
        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val pageFuture = websitePageServiceAsync.getDraft("objectId")

        val page = pageFuture.get()
        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publishDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val future = websitePageServiceAsync.publishDraft("objectId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun schedule() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val future =
            websitePageServiceAsync.schedule(
                ContentScheduleRequestVNext.builder()
                    .id("id")
                    .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setNewLangPrimary() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val future =
            websitePageServiceAsync.setNewLangPrimary(
                SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val websitePageServiceAsync = client.cms().pages().websitePages()

        val pageFuture =
            websitePageServiceAsync.updateDraft(
                WebsitePageUpdateDraftParams.builder()
                    .objectId("objectId")
                    .page(
                        Page.builder()
                            .id("id")
                            .abStatus(Page.AbStatus.AUTOMATED_LOSER_VARIANT)
                            .abTestId("abTestId")
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .archivedInDashboard(true)
                            .addAttachedStylesheet(
                                Page.AttachedStylesheet.builder()
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
                            .contentTypeCategory(Page.ContentTypeCategory._0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .createdById("createdById")
                            .currentlyPublished(true)
                            .currentState(Page.CurrentState.AGENT_GENERATED)
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
                            .language(Page.Language.AA)
                            .layoutSections(
                                Page.LayoutSections.builder()
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
                                Page.ThemeSettingsValues.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .translatedFromId("translatedFromId")
                            .translations(
                                Page.Translations.builder()
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
                                Page.WidgetContainers.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .widgets(
                                Page.Widgets.builder()
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

        val page = pageFuture.get()
        page.validate()
    }
}
