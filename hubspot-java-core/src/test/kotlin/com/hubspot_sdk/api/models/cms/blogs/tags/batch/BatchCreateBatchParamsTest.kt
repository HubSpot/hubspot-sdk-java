// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.tags.batch

import com.hubspot_sdk.api.models.cms.blogs.tags.BatchInputTag
import com.hubspot_sdk.api.models.cms.blogs.tags.Tag
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateBatchParamsTest {

    @Test
    fun create() {
        BatchCreateBatchParams.builder()
            .batchInputTag(
                BatchInputTag.builder()
                    .addInput(
                        Tag.builder()
                            .id("id")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .language(Tag.Language.AA)
                            .name("name")
                            .slug("slug")
                            .translatedFromId(0L)
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
            BatchCreateBatchParams.builder()
                .batchInputTag(
                    BatchInputTag.builder()
                        .addInput(
                            Tag.builder()
                                .id("id")
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .language(Tag.Language.AA)
                                .name("name")
                                .slug("slug")
                                .translatedFromId(0L)
                                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputTag.builder()
                    .addInput(
                        Tag.builder()
                            .id("id")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .language(Tag.Language.AA)
                            .name("name")
                            .slug("slug")
                            .translatedFromId(0L)
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
    }
}
