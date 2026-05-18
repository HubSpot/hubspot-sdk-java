// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.posts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlogPostTest {

    @Test
    fun create() {
        val blogPost =
            BlogPost.builder()
                .id("id")
                .abStatus(BlogPost.AbStatus.AUTOMATED_LOSER_VARIANT)
                .abTestId("abTestId")
                .archivedAt(0L)
                .archivedInDashboard(true)
                .addAttachedStylesheet(
                    BlogPost.AttachedStylesheet.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .authorName("authorName")
                .blogAuthorId("blogAuthorId")
                .campaign("campaign")
                .categoryId(0)
                .contentGroupId("contentGroupId")
                .contentTypeCategory(BlogPost.ContentTypeCategory._0)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdById("createdById")
                .currentlyPublished(true)
                .currentState(BlogPost.CurrentState.AGENT_GENERATED)
                .domain("domain")
                .dynamicPageDataSourceId("dynamicPageDataSourceId")
                .dynamicPageDataSourceType(0)
                .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                .enableDomainStylesheets(true)
                .enableGoogleAmpOutputOverride(true)
                .enableLayoutStylesheets(true)
                .featuredImage("featuredImage")
                .featuredImageAltText("featuredImageAltText")
                .folderId("folderId")
                .footerHtml("footerHtml")
                .headHtml("headHtml")
                .htmlTitle("htmlTitle")
                .includeDefaultCustomCss(true)
                .language(BlogPost.Language.AA)
                .layoutSections(
                    BlogPost.LayoutSections.builder()
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
                .password("password")
                .postBody("postBody")
                .postSummary("postSummary")
                .addPublicAccessRule(PublicAccessRule.builder().build())
                .publicAccessRulesEnabled(true)
                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .publishImmediately(true)
                .rssBody("rssBody")
                .rssSummary("rssSummary")
                .slug("slug")
                .state("state")
                .addTagId(0L)
                .themeSettingsValues(
                    BlogPost.ThemeSettingsValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .translatedFromId("translatedFromId")
                .translations(
                    BlogPost.Translations.builder()
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
                    BlogPost.WidgetContainers.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .widgets(
                    BlogPost.Widgets.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(blogPost.id()).isEqualTo("id")
        assertThat(blogPost.abStatus()).isEqualTo(BlogPost.AbStatus.AUTOMATED_LOSER_VARIANT)
        assertThat(blogPost.abTestId()).isEqualTo("abTestId")
        assertThat(blogPost.archivedAt()).isEqualTo(0L)
        assertThat(blogPost.archivedInDashboard()).isEqualTo(true)
        assertThat(blogPost.attachedStylesheets())
            .containsExactly(
                BlogPost.AttachedStylesheet.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(blogPost.authorName()).isEqualTo("authorName")
        assertThat(blogPost.blogAuthorId()).isEqualTo("blogAuthorId")
        assertThat(blogPost.campaign()).isEqualTo("campaign")
        assertThat(blogPost.categoryId()).isEqualTo(0)
        assertThat(blogPost.contentGroupId()).isEqualTo("contentGroupId")
        assertThat(blogPost.contentTypeCategory()).isEqualTo(BlogPost.ContentTypeCategory._0)
        assertThat(blogPost.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blogPost.createdById()).isEqualTo("createdById")
        assertThat(blogPost.currentlyPublished()).isEqualTo(true)
        assertThat(blogPost.currentState()).isEqualTo(BlogPost.CurrentState.AGENT_GENERATED)
        assertThat(blogPost.domain()).isEqualTo("domain")
        assertThat(blogPost.dynamicPageDataSourceId()).isEqualTo("dynamicPageDataSourceId")
        assertThat(blogPost.dynamicPageDataSourceType()).isEqualTo(0)
        assertThat(blogPost.dynamicPageHubDbTableId()).isEqualTo("dynamicPageHubDbTableId")
        assertThat(blogPost.enableDomainStylesheets()).isEqualTo(true)
        assertThat(blogPost.enableGoogleAmpOutputOverride()).isEqualTo(true)
        assertThat(blogPost.enableLayoutStylesheets()).isEqualTo(true)
        assertThat(blogPost.featuredImage()).isEqualTo("featuredImage")
        assertThat(blogPost.featuredImageAltText()).isEqualTo("featuredImageAltText")
        assertThat(blogPost.folderId()).isEqualTo("folderId")
        assertThat(blogPost.footerHtml()).isEqualTo("footerHtml")
        assertThat(blogPost.headHtml()).isEqualTo("headHtml")
        assertThat(blogPost.htmlTitle()).isEqualTo("htmlTitle")
        assertThat(blogPost.includeDefaultCustomCss()).isEqualTo(true)
        assertThat(blogPost.language()).isEqualTo(BlogPost.Language.AA)
        assertThat(blogPost.layoutSections())
            .isEqualTo(
                BlogPost.LayoutSections.builder()
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
        assertThat(blogPost.linkRelCanonicalUrl()).isEqualTo("linkRelCanonicalUrl")
        assertThat(blogPost.mabExperimentId()).isEqualTo("mabExperimentId")
        assertThat(blogPost.metaDescription()).isEqualTo("metaDescription")
        assertThat(blogPost.name()).isEqualTo("name")
        assertThat(blogPost.pageExpiryDate()).isEqualTo(0L)
        assertThat(blogPost.pageExpiryEnabled()).isEqualTo(true)
        assertThat(blogPost.pageExpiryRedirectId()).isEqualTo(0L)
        assertThat(blogPost.pageExpiryRedirectUrl()).isEqualTo("pageExpiryRedirectUrl")
        assertThat(blogPost.password()).isEqualTo("password")
        assertThat(blogPost.postBody()).isEqualTo("postBody")
        assertThat(blogPost.postSummary()).isEqualTo("postSummary")
        assertThat(blogPost.publicAccessRules()).containsExactly(PublicAccessRule.builder().build())
        assertThat(blogPost.publicAccessRulesEnabled()).isEqualTo(true)
        assertThat(blogPost.publishDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blogPost.publishImmediately()).isEqualTo(true)
        assertThat(blogPost.rssBody()).isEqualTo("rssBody")
        assertThat(blogPost.rssSummary()).isEqualTo("rssSummary")
        assertThat(blogPost.slug()).isEqualTo("slug")
        assertThat(blogPost.state()).isEqualTo("state")
        assertThat(blogPost.tagIds()).containsExactly(0L)
        assertThat(blogPost.themeSettingsValues())
            .isEqualTo(
                BlogPost.ThemeSettingsValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(blogPost.translatedFromId()).isEqualTo("translatedFromId")
        assertThat(blogPost.translations())
            .isEqualTo(
                BlogPost.Translations.builder()
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
        assertThat(blogPost.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blogPost.updatedById()).isEqualTo("updatedById")
        assertThat(blogPost.url()).isEqualTo("url")
        assertThat(blogPost.useFeaturedImage()).isEqualTo(true)
        assertThat(blogPost.widgetContainers())
            .isEqualTo(
                BlogPost.WidgetContainers.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(blogPost.widgets())
            .isEqualTo(
                BlogPost.Widgets.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blogPost =
            BlogPost.builder()
                .id("id")
                .abStatus(BlogPost.AbStatus.AUTOMATED_LOSER_VARIANT)
                .abTestId("abTestId")
                .archivedAt(0L)
                .archivedInDashboard(true)
                .addAttachedStylesheet(
                    BlogPost.AttachedStylesheet.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .authorName("authorName")
                .blogAuthorId("blogAuthorId")
                .campaign("campaign")
                .categoryId(0)
                .contentGroupId("contentGroupId")
                .contentTypeCategory(BlogPost.ContentTypeCategory._0)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdById("createdById")
                .currentlyPublished(true)
                .currentState(BlogPost.CurrentState.AGENT_GENERATED)
                .domain("domain")
                .dynamicPageDataSourceId("dynamicPageDataSourceId")
                .dynamicPageDataSourceType(0)
                .dynamicPageHubDbTableId("dynamicPageHubDbTableId")
                .enableDomainStylesheets(true)
                .enableGoogleAmpOutputOverride(true)
                .enableLayoutStylesheets(true)
                .featuredImage("featuredImage")
                .featuredImageAltText("featuredImageAltText")
                .folderId("folderId")
                .footerHtml("footerHtml")
                .headHtml("headHtml")
                .htmlTitle("htmlTitle")
                .includeDefaultCustomCss(true)
                .language(BlogPost.Language.AA)
                .layoutSections(
                    BlogPost.LayoutSections.builder()
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
                .password("password")
                .postBody("postBody")
                .postSummary("postSummary")
                .addPublicAccessRule(PublicAccessRule.builder().build())
                .publicAccessRulesEnabled(true)
                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .publishImmediately(true)
                .rssBody("rssBody")
                .rssSummary("rssSummary")
                .slug("slug")
                .state("state")
                .addTagId(0L)
                .themeSettingsValues(
                    BlogPost.ThemeSettingsValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .translatedFromId("translatedFromId")
                .translations(
                    BlogPost.Translations.builder()
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
                    BlogPost.WidgetContainers.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .widgets(
                    BlogPost.Widgets.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedBlogPost =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blogPost),
                jacksonTypeRef<BlogPost>(),
            )

        assertThat(roundtrippedBlogPost).isEqualTo(blogPost)
    }
}
