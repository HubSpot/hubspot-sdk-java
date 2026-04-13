// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.authors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import com.hubspot.models.ErrorDetail
import com.hubspot.models.StandardError
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
                        .language(BlogAuthor.Language.AA)
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
                .status(BatchResponseBlogAuthorWithErrors.Status.CANCELED)
                .addError(
                    StandardError.builder()
                        .category("category")
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
                                            "0",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "1",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "2",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "3",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "4",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "5",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "6",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "7",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "8",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "9",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "10",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "11",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "12",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "13",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "14",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "15",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "16",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "17",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "18",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "19",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "20",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "21",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "22",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "23",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "24",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "25",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "26",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "27",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "28",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "29",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "30",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "31",
                                            JsonValue.from(listOf("string")),
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
                        .message("message")
                        .status("status")
                        .id("id")
                        .subCategory(JsonValue.from(mapOf<String, Any>()))
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
                    .language(BlogAuthor.Language.AA)
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
            .isEqualTo(BatchResponseBlogAuthorWithErrors.Status.CANCELED)
        assertThat(batchResponseBlogAuthorWithErrors.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("category")
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
                                    .putAdditionalProperty("0", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("1", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("2", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("3", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("4", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("5", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("6", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("7", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("8", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("9", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("10", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("11", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("12", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("13", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("14", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("15", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("16", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("17", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("18", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("19", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("20", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("21", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("22", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("23", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("24", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("25", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("26", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("27", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("28", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("29", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("30", JsonValue.from(listOf("string")))
                                    .putAdditionalProperty("31", JsonValue.from(listOf("string")))
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
                    .message("message")
                    .status("status")
                    .id("id")
                    .subCategory(JsonValue.from(mapOf<String, Any>()))
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
                        .language(BlogAuthor.Language.AA)
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
                .status(BatchResponseBlogAuthorWithErrors.Status.CANCELED)
                .addError(
                    StandardError.builder()
                        .category("category")
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
                                            "0",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "1",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "2",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "3",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "4",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "5",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "6",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "7",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "8",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "9",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "10",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "11",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "12",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "13",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "14",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "15",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "16",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "17",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "18",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "19",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "20",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "21",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "22",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "23",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "24",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "25",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "26",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "27",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "28",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "29",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "30",
                                            JsonValue.from(listOf("string")),
                                        )
                                        .putAdditionalProperty(
                                            "31",
                                            JsonValue.from(listOf("string")),
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
                        .message("message")
                        .status("status")
                        .id("id")
                        .subCategory(JsonValue.from(mapOf<String, Any>()))
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
