// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.models.cms.pages.BatchInputContentFolder
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageCreateFoldersBatchParamsTest {

    @Test
    fun create() {
        LandingPageCreateFoldersBatchParams.builder()
            .batchInputContentFolder(
                BatchInputContentFolder.builder()
                    .addInput(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            LandingPageCreateFoldersBatchParams.builder()
                .batchInputContentFolder(
                    BatchInputContentFolder.builder()
                        .addInput(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputContentFolder.builder()
                    .addInput(
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
            )
    }
}
