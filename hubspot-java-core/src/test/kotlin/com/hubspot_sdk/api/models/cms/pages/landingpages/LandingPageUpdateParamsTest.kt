// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import com.hubspot_sdk.api.models.cms.pages.PageData
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageUpdateParamsTest {

    @Test
    fun create() {
        LandingPageUpdateParams.builder()
            .objectId("objectId")
            .archived(true)
            .pageData(
                PageData.builder()
                    .id("id")
                    .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                    .abTestId("abTestId")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedInDashboard(true)
                    .addAttachedStylesheet(
                        PageData.AttachedStylesheet.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                        PageData.ThemeSettingsValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .widgets(
                        PageData.Widgets.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LandingPageUpdateParams.builder()
                .objectId("objectId")
                .pageData(
                    PageData.builder()
                        .id("id")
                        .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                        .abTestId("abTestId")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedInDashboard(true)
                        .addAttachedStylesheet(
                            PageData.AttachedStylesheet.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                                                                "units" to "deg",
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
                                                                "flexboxPositioning" to
                                                                    "BOTTOM_CENTER",
                                                                "forceFullWidthSection" to true,
                                                                "maxWidthSectionCentering" to 0,
                                                                "verticalAlignment" to "BOTTOM",
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .widgets(
                            PageData.Widgets.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LandingPageUpdateParams.builder()
                .objectId("objectId")
                .archived(true)
                .pageData(
                    PageData.builder()
                        .id("id")
                        .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                        .abTestId("abTestId")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedInDashboard(true)
                        .addAttachedStylesheet(
                            PageData.AttachedStylesheet.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                                                                "units" to "deg",
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
                                                                "flexboxPositioning" to
                                                                    "BOTTOM_CENTER",
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
                            PageData.ThemeSettingsValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .widgets(
                            PageData.Widgets.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            LandingPageUpdateParams.builder()
                .objectId("objectId")
                .pageData(
                    PageData.builder()
                        .id("id")
                        .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                        .abTestId("abTestId")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedInDashboard(true)
                        .addAttachedStylesheet(
                            PageData.AttachedStylesheet.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                                                                "units" to "deg",
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
                                                                "flexboxPositioning" to
                                                                    "BOTTOM_CENTER",
                                                                "forceFullWidthSection" to true,
                                                                "maxWidthSectionCentering" to 0,
                                                                "verticalAlignment" to "BOTTOM",
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .widgets(
                            PageData.Widgets.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            LandingPageUpdateParams.builder()
                .objectId("objectId")
                .archived(true)
                .pageData(
                    PageData.builder()
                        .id("id")
                        .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                        .abTestId("abTestId")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedInDashboard(true)
                        .addAttachedStylesheet(
                            PageData.AttachedStylesheet.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                                                                "units" to "deg",
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
                                                                "flexboxPositioning" to
                                                                    "BOTTOM_CENTER",
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
                            PageData.ThemeSettingsValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .widgets(
                            PageData.Widgets.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PageData.builder()
                    .id("id")
                    .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                    .abTestId("abTestId")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedInDashboard(true)
                    .addAttachedStylesheet(
                        PageData.AttachedStylesheet.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                        PageData.ThemeSettingsValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .widgets(
                        PageData.Widgets.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LandingPageUpdateParams.builder()
                .objectId("objectId")
                .pageData(
                    PageData.builder()
                        .id("id")
                        .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                        .abTestId("abTestId")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedInDashboard(true)
                        .addAttachedStylesheet(
                            PageData.AttachedStylesheet.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                                                                "units" to "deg",
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
                                                                "flexboxPositioning" to
                                                                    "BOTTOM_CENTER",
                                                                "forceFullWidthSection" to true,
                                                                "maxWidthSectionCentering" to 0,
                                                                "verticalAlignment" to "BOTTOM",
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .widgets(
                            PageData.Widgets.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PageData.builder()
                    .id("id")
                    .abStatus(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
                    .abTestId("abTestId")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedInDashboard(true)
                    .addAttachedStylesheet(
                        PageData.AttachedStylesheet.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .widgets(
                        PageData.Widgets.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
    }
}
