// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.tags

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagCreateParamsTest {

    @Test
    fun create() {
        TagCreateParams.builder()
            .tag(
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
    }

    @Test
    fun body() {
        val params =
            TagCreateParams.builder()
                .tag(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }
}
