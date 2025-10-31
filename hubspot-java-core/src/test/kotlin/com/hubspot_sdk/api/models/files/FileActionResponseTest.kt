// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileActionResponseTest {

    @Test
    fun create() {
        val fileActionResponse =
            FileActionResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(FileActionResponse.Status.PENDING)
                .taskId("taskId")
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
                    FileActionResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .result(
                    File.builder()
                        .id("id")
                        .access(File.Access.PUBLIC_INDEXABLE)
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultHostingUrl("defaultHostingUrl")
                        .encoding("encoding")
                        .expiresAt(0L)
                        .extension("extension")
                        .fileMd5("fileMd5")
                        .height(0)
                        .isUsableInContent(true)
                        .name("name")
                        .parentFolderId("parentFolderId")
                        .path("path")
                        .size(0L)
                        .sourceGroup("sourceGroup")
                        .type("type")
                        .url("url")
                        .width(0)
                        .build()
                )
                .build()

        assertThat(fileActionResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileActionResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileActionResponse.status()).isEqualTo(FileActionResponse.Status.PENDING)
        assertThat(fileActionResponse.taskId()).isEqualTo("taskId")
        assertThat(fileActionResponse.errors().getOrNull())
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
        assertThat(fileActionResponse.links())
            .contains(
                FileActionResponse.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(fileActionResponse.numErrors()).contains(0)
        assertThat(fileActionResponse.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileActionResponse.result())
            .contains(
                File.builder()
                    .id("id")
                    .access(File.Access.PUBLIC_INDEXABLE)
                    .archived(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultHostingUrl("defaultHostingUrl")
                    .encoding("encoding")
                    .expiresAt(0L)
                    .extension("extension")
                    .fileMd5("fileMd5")
                    .height(0)
                    .isUsableInContent(true)
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .path("path")
                    .size(0L)
                    .sourceGroup("sourceGroup")
                    .type("type")
                    .url("url")
                    .width(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileActionResponse =
            FileActionResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(FileActionResponse.Status.PENDING)
                .taskId("taskId")
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
                    FileActionResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .result(
                    File.builder()
                        .id("id")
                        .access(File.Access.PUBLIC_INDEXABLE)
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultHostingUrl("defaultHostingUrl")
                        .encoding("encoding")
                        .expiresAt(0L)
                        .extension("extension")
                        .fileMd5("fileMd5")
                        .height(0)
                        .isUsableInContent(true)
                        .name("name")
                        .parentFolderId("parentFolderId")
                        .path("path")
                        .size(0L)
                        .sourceGroup("sourceGroup")
                        .type("type")
                        .url("url")
                        .width(0)
                        .build()
                )
                .build()

        val roundtrippedFileActionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileActionResponse),
                jacksonTypeRef<FileActionResponse>(),
            )

        assertThat(roundtrippedFileActionResponse).isEqualTo(fileActionResponse)
    }
}
