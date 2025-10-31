// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.settings

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingUpdateLanguagesParamsTest {

    @Test
    fun create() {
        SettingUpdateLanguagesParams.builder()
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
            SettingUpdateLanguagesParams.builder()
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
