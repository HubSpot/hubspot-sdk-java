// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagesPageTest {

    @Test
    fun create() {
        val pagesPage =
            PagesPage.builder()
                .id("id")
                .abStatus(PagesPage.AbStatus.AUTOMATED_LOSER_VARIANT)
                .abTestId("abTestId")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedInDashboard(true)
                .addAttachedStylesheet(
                    PagesPage.AttachedStylesheet.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .authorName("authorName")
                .campaign("campaign")
                .categoryId(0)
                .contentGroupId("contentGroupId")
                .contentTypeCategory(PagesPage.ContentTypeCategory._0)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdById("createdById")
                .currentlyPublished(true)
                .currentState(PagesPage.CurrentState.AGENT_GENERATED)
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
                .language(PagesPage.Language.AA)
                .layoutSections(
                    PagesPage.LayoutSections.builder()
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
                                                                        "units" to "DEGREES",
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
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
                                                                        "padding" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "left" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "right" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
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
                                                        mapOf("units" to "DEGREES", "value" to 0),
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
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                    "top" to
                                                                        mapOf(
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                ),
                                                            "padding" to
                                                                mapOf(
                                                                    "bottom" to
                                                                        mapOf(
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                    "left" to
                                                                        mapOf(
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                    "right" to
                                                                        mapOf(
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                    "top" to
                                                                        mapOf(
                                                                            "units" to "CH",
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
                    PagesPage.ThemeSettingsValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .translatedFromId("translatedFromId")
                .translations(
                    PagesPage.Translations.builder()
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
                    PagesPage.WidgetContainers.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .widgets(
                    PagesPage.Widgets.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(pagesPage.id()).isEqualTo("id")
        assertThat(pagesPage.abStatus()).isEqualTo(PagesPage.AbStatus.AUTOMATED_LOSER_VARIANT)
        assertThat(pagesPage.abTestId()).isEqualTo("abTestId")
        assertThat(pagesPage.archivedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pagesPage.archivedInDashboard()).isEqualTo(true)
        assertThat(pagesPage.attachedStylesheets())
            .containsExactly(
                PagesPage.AttachedStylesheet.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(pagesPage.authorName()).isEqualTo("authorName")
        assertThat(pagesPage.campaign()).isEqualTo("campaign")
        assertThat(pagesPage.categoryId()).isEqualTo(0)
        assertThat(pagesPage.contentGroupId()).isEqualTo("contentGroupId")
        assertThat(pagesPage.contentTypeCategory()).isEqualTo(PagesPage.ContentTypeCategory._0)
        assertThat(pagesPage.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pagesPage.createdById()).isEqualTo("createdById")
        assertThat(pagesPage.currentlyPublished()).isEqualTo(true)
        assertThat(pagesPage.currentState()).isEqualTo(PagesPage.CurrentState.AGENT_GENERATED)
        assertThat(pagesPage.domain()).isEqualTo("domain")
        assertThat(pagesPage.dynamicPageDataSourceId()).isEqualTo("dynamicPageDataSourceId")
        assertThat(pagesPage.dynamicPageDataSourceType()).isEqualTo(0)
        assertThat(pagesPage.dynamicPageHubDbTableId()).isEqualTo("dynamicPageHubDbTableId")
        assertThat(pagesPage.enableDomainStylesheets()).isEqualTo(true)
        assertThat(pagesPage.enableLayoutStylesheets()).isEqualTo(true)
        assertThat(pagesPage.featuredImage()).isEqualTo("featuredImage")
        assertThat(pagesPage.featuredImageAltText()).isEqualTo("featuredImageAltText")
        assertThat(pagesPage.folderId()).isEqualTo("folderId")
        assertThat(pagesPage.footerHtml()).isEqualTo("footerHtml")
        assertThat(pagesPage.headHtml()).isEqualTo("headHtml")
        assertThat(pagesPage.htmlTitle()).isEqualTo("htmlTitle")
        assertThat(pagesPage.includeDefaultCustomCss()).isEqualTo(true)
        assertThat(pagesPage.language()).isEqualTo(PagesPage.Language.AA)
        assertThat(pagesPage.layoutSections())
            .isEqualTo(
                PagesPage.LayoutSections.builder()
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
                                                                    "units" to "DEGREES",
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
                                                                                    "units" to "CH",
                                                                                    "value" to 0,
                                                                                ),
                                                                            "top" to
                                                                                mapOf(
                                                                                    "units" to "CH",
                                                                                    "value" to 0,
                                                                                ),
                                                                        ),
                                                                    "padding" to
                                                                        mapOf(
                                                                            "bottom" to
                                                                                mapOf(
                                                                                    "units" to "CH",
                                                                                    "value" to 0,
                                                                                ),
                                                                            "left" to
                                                                                mapOf(
                                                                                    "units" to "CH",
                                                                                    "value" to 0,
                                                                                ),
                                                                            "right" to
                                                                                mapOf(
                                                                                    "units" to "CH",
                                                                                    "value" to 0,
                                                                                ),
                                                                            "top" to
                                                                                mapOf(
                                                                                    "units" to "CH",
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
                                                    mapOf("units" to "DEGREES", "value" to 0),
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
                                                                        "units" to "CH",
                                                                        "value" to 0,
                                                                    ),
                                                                "top" to
                                                                    mapOf(
                                                                        "units" to "CH",
                                                                        "value" to 0,
                                                                    ),
                                                            ),
                                                        "padding" to
                                                            mapOf(
                                                                "bottom" to
                                                                    mapOf(
                                                                        "units" to "CH",
                                                                        "value" to 0,
                                                                    ),
                                                                "left" to
                                                                    mapOf(
                                                                        "units" to "CH",
                                                                        "value" to 0,
                                                                    ),
                                                                "right" to
                                                                    mapOf(
                                                                        "units" to "CH",
                                                                        "value" to 0,
                                                                    ),
                                                                "top" to
                                                                    mapOf(
                                                                        "units" to "CH",
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
        assertThat(pagesPage.linkRelCanonicalUrl()).isEqualTo("linkRelCanonicalUrl")
        assertThat(pagesPage.mabExperimentId()).isEqualTo("mabExperimentId")
        assertThat(pagesPage.metaDescription()).isEqualTo("metaDescription")
        assertThat(pagesPage.name()).isEqualTo("name")
        assertThat(pagesPage.pageExpiryDate()).isEqualTo(0L)
        assertThat(pagesPage.pageExpiryEnabled()).isEqualTo(true)
        assertThat(pagesPage.pageExpiryRedirectId()).isEqualTo(0L)
        assertThat(pagesPage.pageExpiryRedirectUrl()).isEqualTo("pageExpiryRedirectUrl")
        assertThat(pagesPage.pageRedirected()).isEqualTo(true)
        assertThat(pagesPage.password()).isEqualTo("password")
        assertThat(pagesPage.publicAccessRules())
            .containsExactly(PublicAccessRule.builder().build())
        assertThat(pagesPage.publicAccessRulesEnabled()).isEqualTo(true)
        assertThat(pagesPage.publishDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pagesPage.publishImmediately()).isEqualTo(true)
        assertThat(pagesPage.slug()).isEqualTo("slug")
        assertThat(pagesPage.state()).isEqualTo("state")
        assertThat(pagesPage.subcategory()).isEqualTo("subcategory")
        assertThat(pagesPage.templatePath()).isEqualTo("templatePath")
        assertThat(pagesPage.themeSettingsValues())
            .isEqualTo(
                PagesPage.ThemeSettingsValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(pagesPage.translatedFromId()).isEqualTo("translatedFromId")
        assertThat(pagesPage.translations())
            .isEqualTo(
                PagesPage.Translations.builder()
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
        assertThat(pagesPage.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pagesPage.updatedById()).isEqualTo("updatedById")
        assertThat(pagesPage.url()).isEqualTo("url")
        assertThat(pagesPage.useFeaturedImage()).isEqualTo(true)
        assertThat(pagesPage.widgetContainers())
            .isEqualTo(
                PagesPage.WidgetContainers.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(pagesPage.widgets())
            .isEqualTo(
                PagesPage.Widgets.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pagesPage =
            PagesPage.builder()
                .id("id")
                .abStatus(PagesPage.AbStatus.AUTOMATED_LOSER_VARIANT)
                .abTestId("abTestId")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedInDashboard(true)
                .addAttachedStylesheet(
                    PagesPage.AttachedStylesheet.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .authorName("authorName")
                .campaign("campaign")
                .categoryId(0)
                .contentGroupId("contentGroupId")
                .contentTypeCategory(PagesPage.ContentTypeCategory._0)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdById("createdById")
                .currentlyPublished(true)
                .currentState(PagesPage.CurrentState.AGENT_GENERATED)
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
                .language(PagesPage.Language.AA)
                .layoutSections(
                    PagesPage.LayoutSections.builder()
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
                                                                        "units" to "DEGREES",
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
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                            ),
                                                                        "padding" to
                                                                            mapOf(
                                                                                "bottom" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "left" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "right" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
                                                                                        "value" to 0,
                                                                                    ),
                                                                                "top" to
                                                                                    mapOf(
                                                                                        "units" to
                                                                                            "CH",
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
                                                        mapOf("units" to "DEGREES", "value" to 0),
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
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                    "top" to
                                                                        mapOf(
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                ),
                                                            "padding" to
                                                                mapOf(
                                                                    "bottom" to
                                                                        mapOf(
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                    "left" to
                                                                        mapOf(
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                    "right" to
                                                                        mapOf(
                                                                            "units" to "CH",
                                                                            "value" to 0,
                                                                        ),
                                                                    "top" to
                                                                        mapOf(
                                                                            "units" to "CH",
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
                    PagesPage.ThemeSettingsValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .translatedFromId("translatedFromId")
                .translations(
                    PagesPage.Translations.builder()
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
                    PagesPage.WidgetContainers.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .widgets(
                    PagesPage.Widgets.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedPagesPage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pagesPage),
                jacksonTypeRef<PagesPage>(),
            )

        assertThat(roundtrippedPagesPage).isEqualTo(pagesPage)
    }
}
