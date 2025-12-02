// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileoperations

import com.hubspot_sdk.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileOperationSearchParamsTest {

    @Test
    fun create() {
        FileOperationSearchParams.builder()
            .after("after")
            .allowsAnonymousAccess(true)
            .before("before")
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .encoding("encoding")
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .expiresAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .expiresAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .extension("extension")
            .fileMd5("fileMd5")
            .height(0)
            .heightGte(0)
            .heightLte(0)
            .idGte(0L)
            .idLte(0L)
            .addId(0L)
            .isUsableInContent(true)
            .limit(0)
            .name("name")
            .addParentFolderId(0L)
            .path("path")
            .addProperty("string")
            .size(0L)
            .sizeGte(0L)
            .sizeLte(0L)
            .addSort("string")
            .type("type")
            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .url("url")
            .width(0)
            .widthGte(0)
            .widthLte(0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FileOperationSearchParams.builder()
                .after("after")
                .allowsAnonymousAccess(true)
                .before("before")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .encoding("encoding")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extension("extension")
                .fileMd5("fileMd5")
                .height(0)
                .heightGte(0)
                .heightLte(0)
                .idGte(0L)
                .idLte(0L)
                .addId(0L)
                .isUsableInContent(true)
                .limit(0)
                .name("name")
                .addParentFolderId(0L)
                .path("path")
                .addProperty("string")
                .size(0L)
                .sizeGte(0L)
                .sizeLte(0L)
                .addSort("string")
                .type("type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .width(0)
                .widthGte(0)
                .widthLte(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("allowsAnonymousAccess", "true")
                    .put("before", "before")
                    .put("createdAt", "2019-12-27T18:11:19.117Z")
                    .put("createdAtGte", "2019-12-27T18:11:19.117Z")
                    .put("createdAtLte", "2019-12-27T18:11:19.117Z")
                    .put("encoding", "encoding")
                    .put("expiresAt", "2019-12-27T18:11:19.117Z")
                    .put("expiresAtGte", "2019-12-27T18:11:19.117Z")
                    .put("expiresAtLte", "2019-12-27T18:11:19.117Z")
                    .put("extension", "extension")
                    .put("fileMd5", "fileMd5")
                    .put("height", "0")
                    .put("heightGte", "0")
                    .put("heightLte", "0")
                    .put("idGte", "0")
                    .put("idLte", "0")
                    .put("ids", listOf("0").joinToString(","))
                    .put("isUsableInContent", "true")
                    .put("limit", "0")
                    .put("name", "name")
                    .put("parentFolderIds", listOf("0").joinToString(","))
                    .put("path", "path")
                    .put("properties", listOf("string").joinToString(","))
                    .put("size", "0")
                    .put("sizeGte", "0")
                    .put("sizeLte", "0")
                    .put("sort", listOf("string").joinToString(","))
                    .put("type", "type")
                    .put("updatedAt", "2019-12-27T18:11:19.117Z")
                    .put("updatedAtGte", "2019-12-27T18:11:19.117Z")
                    .put("updatedAtLte", "2019-12-27T18:11:19.117Z")
                    .put("url", "url")
                    .put("width", "0")
                    .put("widthGte", "0")
                    .put("widthLte", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileOperationSearchParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
