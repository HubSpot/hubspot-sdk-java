// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.files.folders

import com.hubspot.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderSearchParamsTest {

    @Test
    fun create() {
        FolderSearchParams.builder()
            .after("after")
            .before("before")
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .idGte(0L)
            .idLte(0L)
            .addId(0L)
            .limit(0)
            .name("name")
            .addParentFolderId(0L)
            .path("path")
            .addProperty("string")
            .addSort("string")
            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FolderSearchParams.builder()
                .after("after")
                .before("before")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .idGte(0L)
                .idLte(0L)
                .addId(0L)
                .limit(0)
                .name("name")
                .addParentFolderId(0L)
                .path("path")
                .addProperty("string")
                .addSort("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAtGte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAtLte(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("before", "before")
                    .put("createdAt", "2019-12-27T18:11:19.117Z")
                    .put("createdAtGte", "2019-12-27T18:11:19.117Z")
                    .put("createdAtLte", "2019-12-27T18:11:19.117Z")
                    .put("idGte", "0")
                    .put("idLte", "0")
                    .put("ids", listOf("0").joinToString(","))
                    .put("limit", "0")
                    .put("name", "name")
                    .put("parentFolderIds", listOf("0").joinToString(","))
                    .put("path", "path")
                    .put("properties", listOf("string").joinToString(","))
                    .put("sort", listOf("string").joinToString(","))
                    .put("updatedAt", "2019-12-27T18:11:19.117Z")
                    .put("updatedAtGte", "2019-12-27T18:11:19.117Z")
                    .put("updatedAtLte", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FolderSearchParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
