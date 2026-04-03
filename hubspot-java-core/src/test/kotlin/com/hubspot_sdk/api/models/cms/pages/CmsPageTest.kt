// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CmsPageTest {

    @Test
    fun create() {
        val cmsPage =
            CmsPage.builder()
                .id("id")
                .abStatus(CmsPage.AbStatus.AUTOMATED_LOSER_VARIANT)
                .abTestId("abTestId")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedInDashboard(true)
                .addAttachedStylesheet(
                    CmsPage.AttachedStylesheet.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .authorName("authorName")
                .campaign("campaign")
                .categoryId(0)
                .contentGroupId("contentGroupId")
                .contentTypeCategory(CmsPage.ContentTypeCategory._0)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdById("createdById")
                .currentlyPublished(true)
                .currentState(CmsPage.CurrentState.AGENT_GENERATED)
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
                .language(CmsPage.Language.AA)
                .layoutSections(
                    CmsPage.LayoutSections.builder()
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
                    CmsPage.ThemeSettingsValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .translatedFromId("translatedFromId")
                .translations(
                    CmsPage.Translations.builder()
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
                    CmsPage.WidgetContainers.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .widgets(
                    CmsPage.Widgets.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(cmsPage.id()).isEqualTo("id")
        assertThat(cmsPage.abStatus()).isEqualTo(CmsPage.AbStatus.AUTOMATED_LOSER_VARIANT)
        assertThat(cmsPage.abTestId()).isEqualTo("abTestId")
        assertThat(cmsPage.archivedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cmsPage.archivedInDashboard()).isEqualTo(true)
        assertThat(cmsPage.attachedStylesheets())
            .containsExactly(
                CmsPage.AttachedStylesheet.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(cmsPage.authorName()).isEqualTo("authorName")
        assertThat(cmsPage.campaign()).isEqualTo("campaign")
        assertThat(cmsPage.categoryId()).isEqualTo(0)
        assertThat(cmsPage.contentGroupId()).isEqualTo("contentGroupId")
        assertThat(cmsPage.contentTypeCategory()).isEqualTo(CmsPage.ContentTypeCategory._0)
        assertThat(cmsPage.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cmsPage.createdById()).isEqualTo("createdById")
        assertThat(cmsPage.currentlyPublished()).isEqualTo(true)
        assertThat(cmsPage.currentState()).isEqualTo(CmsPage.CurrentState.AGENT_GENERATED)
        assertThat(cmsPage.domain()).isEqualTo("domain")
        assertThat(cmsPage.dynamicPageDataSourceId()).isEqualTo("dynamicPageDataSourceId")
        assertThat(cmsPage.dynamicPageDataSourceType()).isEqualTo(0)
        assertThat(cmsPage.dynamicPageHubDbTableId()).isEqualTo("dynamicPageHubDbTableId")
        assertThat(cmsPage.enableDomainStylesheets()).isEqualTo(true)
        assertThat(cmsPage.enableLayoutStylesheets()).isEqualTo(true)
        assertThat(cmsPage.featuredImage()).isEqualTo("featuredImage")
        assertThat(cmsPage.featuredImageAltText()).isEqualTo("featuredImageAltText")
        assertThat(cmsPage.folderId()).isEqualTo("folderId")
        assertThat(cmsPage.footerHtml()).isEqualTo("footerHtml")
        assertThat(cmsPage.headHtml()).isEqualTo("headHtml")
        assertThat(cmsPage.htmlTitle()).isEqualTo("htmlTitle")
        assertThat(cmsPage.includeDefaultCustomCss()).isEqualTo(true)
        assertThat(cmsPage.language()).isEqualTo(CmsPage.Language.AA)
        assertThat(cmsPage.layoutSections())
            .isEqualTo(
                CmsPage.LayoutSections.builder()
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
        assertThat(cmsPage.linkRelCanonicalUrl()).isEqualTo("linkRelCanonicalUrl")
        assertThat(cmsPage.mabExperimentId()).isEqualTo("mabExperimentId")
        assertThat(cmsPage.metaDescription()).isEqualTo("metaDescription")
        assertThat(cmsPage.name()).isEqualTo("name")
        assertThat(cmsPage.pageExpiryDate()).isEqualTo(0L)
        assertThat(cmsPage.pageExpiryEnabled()).isEqualTo(true)
        assertThat(cmsPage.pageExpiryRedirectId()).isEqualTo(0L)
        assertThat(cmsPage.pageExpiryRedirectUrl()).isEqualTo("pageExpiryRedirectUrl")
        assertThat(cmsPage.pageRedirected()).isEqualTo(true)
        assertThat(cmsPage.password()).isEqualTo("password")
        assertThat(cmsPage.publicAccessRules()).containsExactly(PublicAccessRule.builder().build())
        assertThat(cmsPage.publicAccessRulesEnabled()).isEqualTo(true)
        assertThat(cmsPage.publishDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cmsPage.publishImmediately()).isEqualTo(true)
        assertThat(cmsPage.slug()).isEqualTo("slug")
        assertThat(cmsPage.state()).isEqualTo("state")
        assertThat(cmsPage.subcategory()).isEqualTo("subcategory")
        assertThat(cmsPage.templatePath()).isEqualTo("templatePath")
        assertThat(cmsPage.themeSettingsValues())
            .isEqualTo(
                CmsPage.ThemeSettingsValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(cmsPage.translatedFromId()).isEqualTo("translatedFromId")
        assertThat(cmsPage.translations())
            .isEqualTo(
                CmsPage.Translations.builder()
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
        assertThat(cmsPage.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cmsPage.updatedById()).isEqualTo("updatedById")
        assertThat(cmsPage.url()).isEqualTo("url")
        assertThat(cmsPage.useFeaturedImage()).isEqualTo(true)
        assertThat(cmsPage.widgetContainers())
            .isEqualTo(
                CmsPage.WidgetContainers.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(cmsPage.widgets())
            .isEqualTo(
                CmsPage.Widgets.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cmsPage =
            CmsPage.builder()
                .id("id")
                .abStatus(CmsPage.AbStatus.AUTOMATED_LOSER_VARIANT)
                .abTestId("abTestId")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedInDashboard(true)
                .addAttachedStylesheet(
                    CmsPage.AttachedStylesheet.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .authorName("authorName")
                .campaign("campaign")
                .categoryId(0)
                .contentGroupId("contentGroupId")
                .contentTypeCategory(CmsPage.ContentTypeCategory._0)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdById("createdById")
                .currentlyPublished(true)
                .currentState(CmsPage.CurrentState.AGENT_GENERATED)
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
                .language(CmsPage.Language.AA)
                .layoutSections(
                    CmsPage.LayoutSections.builder()
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
                    CmsPage.ThemeSettingsValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .translatedFromId("translatedFromId")
                .translations(
                    CmsPage.Translations.builder()
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
                    CmsPage.WidgetContainers.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .widgets(
                    CmsPage.Widgets.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedCmsPage =
            jsonMapper.readValue(jsonMapper.writeValueAsString(cmsPage), jacksonTypeRef<CmsPage>())

        assertThat(roundtrippedCmsPage).isEqualTo(cmsPage)
    }
}
