// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.folders

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderUpdateParamsTest {

    @Test
    fun create() {
        FolderUpdateParams.builder()
            .objectId("objectId")
            .archived(true)
            .contentFolder(
                ContentFolder.builder()
                    .id("id")
                    .category(0)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .parentFolderId(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FolderUpdateParams.builder()
                .objectId("objectId")
                .contentFolder(
                    ContentFolder.builder()
                        .id("id")
                        .category(0)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .parentFolderId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
            FolderUpdateParams.builder()
                .objectId("objectId")
                .archived(true)
                .contentFolder(
                    ContentFolder.builder()
                        .id("id")
                        .category(0)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .parentFolderId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FolderUpdateParams.builder()
                .objectId("objectId")
                .contentFolder(
                    ContentFolder.builder()
                        .id("id")
                        .category(0)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .parentFolderId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            FolderUpdateParams.builder()
                .objectId("objectId")
                .archived(true)
                .contentFolder(
                    ContentFolder.builder()
                        .id("id")
                        .category(0)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .parentFolderId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ContentFolder.builder()
                    .id("id")
                    .category(0)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .parentFolderId(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FolderUpdateParams.builder()
                .objectId("objectId")
                .contentFolder(
                    ContentFolder.builder()
                        .id("id")
                        .category(0)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .parentFolderId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ContentFolder.builder()
                    .id("id")
                    .category(0)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .parentFolderId(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
