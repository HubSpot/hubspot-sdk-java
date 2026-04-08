// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PageDataTest {

    @Test
    fun create() {
        val pageData =
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
                                                    "backgroundPosition" to "backgroundPosition",
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

        assertThat(pageData.id()).isEqualTo("id")
        assertThat(pageData.abStatus()).isEqualTo(PageData.AbStatus.AUTOMATED_LOSER_VARIANT)
        assertThat(pageData.abTestId()).isEqualTo("abTestId")
        assertThat(pageData.archivedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pageData.archivedInDashboard()).isEqualTo(true)
        assertThat(pageData.attachedStylesheets())
            .containsExactly(
                PageData.AttachedStylesheet.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(pageData.authorName()).isEqualTo("authorName")
        assertThat(pageData.campaign()).isEqualTo("campaign")
        assertThat(pageData.categoryId()).isEqualTo(0)
        assertThat(pageData.contentGroupId()).isEqualTo("contentGroupId")
        assertThat(pageData.contentTypeCategory()).isEqualTo(PageData.ContentTypeCategory._0)
        assertThat(pageData.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pageData.createdById()).isEqualTo("createdById")
        assertThat(pageData.currentlyPublished()).isEqualTo(true)
        assertThat(pageData.currentState()).isEqualTo(PageData.CurrentState.AGENT_GENERATED)
        assertThat(pageData.domain()).isEqualTo("domain")
        assertThat(pageData.dynamicPageDataSourceId()).isEqualTo("dynamicPageDataSourceId")
        assertThat(pageData.dynamicPageDataSourceType()).isEqualTo(0)
        assertThat(pageData.dynamicPageHubDbTableId()).isEqualTo("dynamicPageHubDbTableId")
        assertThat(pageData.enableDomainStylesheets()).isEqualTo(true)
        assertThat(pageData.enableLayoutStylesheets()).isEqualTo(true)
        assertThat(pageData.featuredImage()).isEqualTo("featuredImage")
        assertThat(pageData.featuredImageAltText()).isEqualTo("featuredImageAltText")
        assertThat(pageData.folderId()).isEqualTo("folderId")
        assertThat(pageData.footerHtml()).isEqualTo("footerHtml")
        assertThat(pageData.headHtml()).isEqualTo("headHtml")
        assertThat(pageData.htmlTitle()).isEqualTo("htmlTitle")
        assertThat(pageData.includeDefaultCustomCss()).isEqualTo(true)
        assertThat(pageData.language()).isEqualTo(PageData.Language.AA)
        assertThat(pageData.layoutSections())
            .isEqualTo(
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
                                        )
                                    ),
                                "rows" to listOf(mapOf<String, Any>()),
                                "styles" to
                                    mapOf(
                                        "backgroundColor" to
                                            mapOf("a" to 0, "b" to 0, "g" to 0, "r" to 0),
                                        "backgroundGradient" to
                                            mapOf(
                                                "angle" to mapOf("units" to "deg", "value" to 0),
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
                                                "backgroundPosition" to "backgroundPosition",
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
        assertThat(pageData.linkRelCanonicalUrl()).isEqualTo("linkRelCanonicalUrl")
        assertThat(pageData.mabExperimentId()).isEqualTo("mabExperimentId")
        assertThat(pageData.metaDescription()).isEqualTo("metaDescription")
        assertThat(pageData.name()).isEqualTo("name")
        assertThat(pageData.pageExpiryDate()).isEqualTo(0L)
        assertThat(pageData.pageExpiryEnabled()).isEqualTo(true)
        assertThat(pageData.pageExpiryRedirectId()).isEqualTo(0L)
        assertThat(pageData.pageExpiryRedirectUrl()).isEqualTo("pageExpiryRedirectUrl")
        assertThat(pageData.pageRedirected()).isEqualTo(true)
        assertThat(pageData.password()).isEqualTo("password")
        assertThat(pageData.publicAccessRules()).containsExactly(PublicAccessRule.builder().build())
        assertThat(pageData.publicAccessRulesEnabled()).isEqualTo(true)
        assertThat(pageData.publishDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pageData.publishImmediately()).isEqualTo(true)
        assertThat(pageData.slug()).isEqualTo("slug")
        assertThat(pageData.state()).isEqualTo("state")
        assertThat(pageData.subcategory()).isEqualTo("subcategory")
        assertThat(pageData.templatePath()).isEqualTo("templatePath")
        assertThat(pageData.themeSettingsValues())
            .isEqualTo(
                PageData.ThemeSettingsValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(pageData.translatedFromId()).isEqualTo("translatedFromId")
        assertThat(pageData.translations())
            .isEqualTo(
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
        assertThat(pageData.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pageData.updatedById()).isEqualTo("updatedById")
        assertThat(pageData.url()).isEqualTo("url")
        assertThat(pageData.useFeaturedImage()).isEqualTo(true)
        assertThat(pageData.widgetContainers())
            .isEqualTo(
                PageData.WidgetContainers.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(pageData.widgets())
            .isEqualTo(
                PageData.Widgets.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pageData =
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
                                                    "backgroundPosition" to "backgroundPosition",
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

        val roundtrippedPageData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pageData),
                jacksonTypeRef<PageData>(),
            )

        assertThat(roundtrippedPageData).isEqualTo(pageData)
    }
}
