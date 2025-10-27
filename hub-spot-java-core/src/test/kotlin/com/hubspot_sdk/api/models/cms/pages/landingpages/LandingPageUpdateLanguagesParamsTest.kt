// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages.landingpages

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LandingPageUpdateLanguagesParamsTest {

    @Test
    fun create() {
        LandingPageUpdateLanguagesParams.builder()
            .updateLanguagesRequestVNext(
                UpdateLanguagesRequestVNext.builder()
                    .languages(
                        UpdateLanguagesRequestVNext.Languages.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
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
            LandingPageUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(
                    UpdateLanguagesRequestVNext.builder()
                        .languages(
                            UpdateLanguagesRequestVNext.Languages.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
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
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .primaryId("primaryId")
                    .build()
            )
    }
}
