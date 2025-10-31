// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseBlogAuthorWithErrorsTest {

    @Test
    fun create() {
        val batchResponseBlogAuthorWithErrors =
            BatchResponseBlogAuthorWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BlogAuthor.builder()
                        .id("id")
                        .avatar("avatar")
                        .bio("bio")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("displayName")
                        .email("email")
                        .facebook("facebook")
                        .fullName("fullName")
                        .language(BlogAuthor.Language.AF)
                        .linkedin("linkedin")
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .twitter("twitter")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseBlogAuthorWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseBlogAuthorWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseBlogAuthorWithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseBlogAuthorWithErrors.results())
            .containsExactly(
                BlogAuthor.builder()
                    .id("id")
                    .avatar("avatar")
                    .bio("bio")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("displayName")
                    .email("email")
                    .facebook("facebook")
                    .fullName("fullName")
                    .language(BlogAuthor.Language.AF)
                    .linkedin("linkedin")
                    .name("name")
                    .slug("slug")
                    .translatedFromId(0L)
                    .twitter("twitter")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("website")
                    .build()
            )
        assertThat(batchResponseBlogAuthorWithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseBlogAuthorWithErrors.status())
            .isEqualTo(BatchResponseBlogAuthorWithErrors.Status.PENDING)
        assertThat(batchResponseBlogAuthorWithErrors.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("")
                    .context(
                        StandardError.Context.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addError(
                        ErrorDetail.builder()
                            .message("message")
                            .code("code")
                            .context(
                                ErrorDetail.Context.builder()
                                    .putAdditionalProperty(
                                        "missingScopes",
                                        JsonValue.from(listOf("scope1", "scope2")),
                                    )
                                    .build()
                            )
                            .in_("in")
                            .subCategory("subCategory")
                            .build()
                    )
                    .links(
                        StandardError.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("")
                    .status("")
                    .id("")
                    .subCategory(JsonValue.from(""))
                    .build()
            )
        assertThat(batchResponseBlogAuthorWithErrors.links())
            .contains(
                BatchResponseBlogAuthorWithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseBlogAuthorWithErrors.numErrors()).contains(0)
        assertThat(batchResponseBlogAuthorWithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseBlogAuthorWithErrors =
            BatchResponseBlogAuthorWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BlogAuthor.builder()
                        .id("id")
                        .avatar("avatar")
                        .bio("bio")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("displayName")
                        .email("email")
                        .facebook("facebook")
                        .fullName("fullName")
                        .language(BlogAuthor.Language.AF)
                        .linkedin("linkedin")
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .twitter("twitter")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseBlogAuthorWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseBlogAuthorWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseBlogAuthorWithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseBlogAuthorWithErrors),
                jacksonTypeRef<BatchResponseBlogAuthorWithErrors>(),
            )

        assertThat(roundtrippedBatchResponseBlogAuthorWithErrors)
            .isEqualTo(batchResponseBlogAuthorWithErrors)
    }
}
