// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns.assets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetUpdateParamsTest {

    @Test
    fun create() {
        AssetUpdateParams.builder()
            .campaignGuid("campaignGuid")
            .assetType("assetType")
            .assetId("assetId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssetUpdateParams.builder()
                .campaignGuid("campaignGuid")
                .assetType("assetType")
                .assetId("assetId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        assertThat(params._pathParam(1)).isEqualTo("assetType")
        assertThat(params._pathParam(2)).isEqualTo("assetId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
