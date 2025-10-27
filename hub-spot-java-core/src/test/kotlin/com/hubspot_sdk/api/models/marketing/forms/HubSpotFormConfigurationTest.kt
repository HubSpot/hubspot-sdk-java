// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubSpotFormConfigurationTest {

    @Test
    fun create() {
        val hubSpotFormConfiguration =
            HubSpotFormConfiguration.builder()
                .allowLinkToResetKnownValues(true)
                .archivable(true)
                .cloneable(true)
                .createNewContactForNewEmail(true)
                .editable(true)
                .language(HubSpotFormConfiguration.Language.AF)
                .notifyContactOwner(true)
                .addNotifyRecipient("string")
                .postSubmitAction(
                    FormPostSubmitAction.builder()
                        .type(FormPostSubmitAction.Type.THANK_YOU)
                        .value("value")
                        .build()
                )
                .prePopulateKnownValues(true)
                .recaptchaEnabled(true)
                .addLifecycleStage(
                    LifecycleStage.builder().objectTypeId("objectTypeId").value("value").build()
                )
                .build()

        assertThat(hubSpotFormConfiguration.allowLinkToResetKnownValues()).isEqualTo(true)
        assertThat(hubSpotFormConfiguration.archivable()).isEqualTo(true)
        assertThat(hubSpotFormConfiguration.cloneable()).isEqualTo(true)
        assertThat(hubSpotFormConfiguration.createNewContactForNewEmail()).isEqualTo(true)
        assertThat(hubSpotFormConfiguration.editable()).isEqualTo(true)
        assertThat(hubSpotFormConfiguration.language())
            .isEqualTo(HubSpotFormConfiguration.Language.AF)
        assertThat(hubSpotFormConfiguration.notifyContactOwner()).isEqualTo(true)
        assertThat(hubSpotFormConfiguration.notifyRecipients()).containsExactly("string")
        assertThat(hubSpotFormConfiguration.postSubmitAction())
            .isEqualTo(
                FormPostSubmitAction.builder()
                    .type(FormPostSubmitAction.Type.THANK_YOU)
                    .value("value")
                    .build()
            )
        assertThat(hubSpotFormConfiguration.prePopulateKnownValues()).isEqualTo(true)
        assertThat(hubSpotFormConfiguration.recaptchaEnabled()).isEqualTo(true)
        assertThat(hubSpotFormConfiguration.lifecycleStages().getOrNull())
            .containsExactly(
                LifecycleStage.builder().objectTypeId("objectTypeId").value("value").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubSpotFormConfiguration =
            HubSpotFormConfiguration.builder()
                .allowLinkToResetKnownValues(true)
                .archivable(true)
                .cloneable(true)
                .createNewContactForNewEmail(true)
                .editable(true)
                .language(HubSpotFormConfiguration.Language.AF)
                .notifyContactOwner(true)
                .addNotifyRecipient("string")
                .postSubmitAction(
                    FormPostSubmitAction.builder()
                        .type(FormPostSubmitAction.Type.THANK_YOU)
                        .value("value")
                        .build()
                )
                .prePopulateKnownValues(true)
                .recaptchaEnabled(true)
                .addLifecycleStage(
                    LifecycleStage.builder().objectTypeId("objectTypeId").value("value").build()
                )
                .build()

        val roundtrippedHubSpotFormConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubSpotFormConfiguration),
                jacksonTypeRef<HubSpotFormConfiguration>(),
            )

        assertThat(roundtrippedHubSpotFormConfiguration).isEqualTo(hubSpotFormConfiguration)
    }
}
