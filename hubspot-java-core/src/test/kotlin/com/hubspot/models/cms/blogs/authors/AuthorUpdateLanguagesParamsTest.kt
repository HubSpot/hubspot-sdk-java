// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.authors

import com.hubspot.core.JsonValue
import com.hubspot.models.cms.UpdateLanguagesRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorUpdateLanguagesParamsTest {

    @Test
    fun create() {
        AuthorUpdateLanguagesParams.builder()
            .updateLanguagesRequestVNext(
                UpdateLanguagesRequestVNext.builder()
                    .languages(
                        UpdateLanguagesRequestVNext.Languages.builder()
                            .putAdditionalProperty("foo", JsonValue.from("aa"))
                            .build()
                    )
                    .primaryId("primaryId")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthorUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(
                    UpdateLanguagesRequestVNext.builder()
                        .languages(
                            UpdateLanguagesRequestVNext.Languages.builder()
                                .putAdditionalProperty("foo", JsonValue.from("aa"))
                                .build()
                        )
                        .primaryId("primaryId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateLanguagesRequestVNext.builder()
                    .languages(
                        UpdateLanguagesRequestVNext.Languages.builder()
                            .putAdditionalProperty("foo", JsonValue.from("aa"))
                            .build()
                    )
                    .primaryId("primaryId")
                    .build()
            )
    }
}
