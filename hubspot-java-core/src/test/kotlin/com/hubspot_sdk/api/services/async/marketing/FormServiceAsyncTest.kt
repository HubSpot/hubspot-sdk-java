// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.forms.DependentField
import com.hubspot_sdk.api.models.marketing.forms.DependentFieldFilter
import com.hubspot_sdk.api.models.marketing.forms.EmailField
import com.hubspot_sdk.api.models.marketing.forms.EmailFieldValidation
import com.hubspot_sdk.api.models.marketing.forms.FieldGroup
import com.hubspot_sdk.api.models.marketing.forms.FormDefinitionCreateRequestBase
import com.hubspot_sdk.api.models.marketing.forms.FormDisplayOptions
import com.hubspot_sdk.api.models.marketing.forms.FormGetParams
import com.hubspot_sdk.api.models.marketing.forms.FormPostSubmitAction
import com.hubspot_sdk.api.models.marketing.forms.FormReplaceParams
import com.hubspot_sdk.api.models.marketing.forms.FormStyle
import com.hubspot_sdk.api.models.marketing.forms.FormUpdateParams
import com.hubspot_sdk.api.models.marketing.forms.HubSpotFormConfiguration
import com.hubspot_sdk.api.models.marketing.forms.HubSpotFormDefinition
import com.hubspot_sdk.api.models.marketing.forms.HubSpotFormDefinitionPatchRequest
import com.hubspot_sdk.api.models.marketing.forms.LegalConsentOptionsNone
import com.hubspot_sdk.api.models.marketing.forms.LifecycleStage
import com.hubspot_sdk.api.models.marketing.forms.PhoneField
import com.hubspot_sdk.api.models.marketing.forms.PhoneFieldValidation
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FormServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val formServiceAsync = client.marketing().forms()

        val formDefinitionBaseFuture =
            formServiceAsync.create(
                FormDefinitionCreateRequestBase.builder()
                    .archived(true)
                    .configuration(
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
                                LifecycleStage.builder()
                                    .objectTypeId("objectTypeId")
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayOptions(
                        FormDisplayOptions.builder()
                            .renderRawHtml(true)
                            .style(
                                FormStyle.builder()
                                    .backgroundWidth("backgroundWidth")
                                    .fontFamily("fontFamily")
                                    .helpTextColor("helpTextColor")
                                    .helpTextSize("helpTextSize")
                                    .labelTextColor("labelTextColor")
                                    .labelTextSize("labelTextSize")
                                    .legalConsentTextColor("legalConsentTextColor")
                                    .legalConsentTextSize("legalConsentTextSize")
                                    .submitAlignment(FormStyle.SubmitAlignment.LEFT)
                                    .submitColor("submitColor")
                                    .submitFontColor("submitFontColor")
                                    .submitSize("submitSize")
                                    .build()
                            )
                            .submitButtonText("submitButtonText")
                            .theme(FormDisplayOptions.Theme.DEFAULT_STYLE)
                            .cssClass("cssClass")
                            .build()
                    )
                    .addFieldGroup(
                        FieldGroup.builder()
                            .addField(
                                EmailField.builder()
                                    .addDependentField(
                                        DependentField.builder()
                                            .dependentCondition(
                                                DependentFieldFilter.builder()
                                                    .operator(DependentFieldFilter.Operator.EQ)
                                                    .rangeEnd("rangeEnd")
                                                    .rangeStart("rangeStart")
                                                    .value("value")
                                                    .addValue("string")
                                                    .build()
                                            )
                                            .dependentField(
                                                PhoneField.builder()
                                                    .dependentFields(listOf())
                                                    .fieldType(PhoneField.FieldType.PHONE)
                                                    .hidden(true)
                                                    .label("label")
                                                    .name("name")
                                                    .objectTypeId("objectTypeId")
                                                    .required(true)
                                                    .useCountryCodeSelect(true)
                                                    .validation(
                                                        PhoneFieldValidation.builder()
                                                            .maxAllowedDigits(0)
                                                            .minAllowedDigits(0)
                                                            .build()
                                                    )
                                                    .defaultValue("defaultValue")
                                                    .description("description")
                                                    .placeholder("placeholder")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .fieldType(EmailField.FieldType.EMAIL)
                                    .hidden(true)
                                    .label("label")
                                    .name("name")
                                    .objectTypeId("objectTypeId")
                                    .required(true)
                                    .validation(
                                        EmailFieldValidation.builder()
                                            .addBlockedEmailDomain("string")
                                            .useDefaultBlockList(true)
                                            .build()
                                    )
                                    .defaultValue("defaultValue")
                                    .description("description")
                                    .placeholder("placeholder")
                                    .build()
                            )
                            .groupType(FieldGroup.GroupType.DEFAULT_GROUP)
                            .richTextType(FieldGroup.RichTextType.TEXT)
                            .richText("richText")
                            .build()
                    )
                    .formType(FormDefinitionCreateRequestBase.FormType.HUBSPOT)
                    .legalConsentOptions(
                        LegalConsentOptionsNone.builder()
                            .type(LegalConsentOptionsNone.Type.NONE)
                            .build()
                    )
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val formDefinitionBase = formDefinitionBaseFuture.get()
        formDefinitionBase.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val formServiceAsync = client.marketing().forms()

        val formDefinitionBaseFuture =
            formServiceAsync.update(
                FormUpdateParams.builder()
                    .formId("formId")
                    .hubSpotFormDefinitionPatchRequest(
                        HubSpotFormDefinitionPatchRequest.builder()
                            .archived(true)
                            .configuration(
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
                                        LifecycleStage.builder()
                                            .objectTypeId("objectTypeId")
                                            .value("value")
                                            .build()
                                    )
                                    .build()
                            )
                            .displayOptions(
                                FormDisplayOptions.builder()
                                    .renderRawHtml(true)
                                    .style(
                                        FormStyle.builder()
                                            .backgroundWidth("backgroundWidth")
                                            .fontFamily("fontFamily")
                                            .helpTextColor("helpTextColor")
                                            .helpTextSize("helpTextSize")
                                            .labelTextColor("labelTextColor")
                                            .labelTextSize("labelTextSize")
                                            .legalConsentTextColor("legalConsentTextColor")
                                            .legalConsentTextSize("legalConsentTextSize")
                                            .submitAlignment(FormStyle.SubmitAlignment.LEFT)
                                            .submitColor("submitColor")
                                            .submitFontColor("submitFontColor")
                                            .submitSize("submitSize")
                                            .build()
                                    )
                                    .submitButtonText("submitButtonText")
                                    .theme(FormDisplayOptions.Theme.DEFAULT_STYLE)
                                    .cssClass("cssClass")
                                    .build()
                            )
                            .addFieldGroup(
                                FieldGroup.builder()
                                    .addField(
                                        EmailField.builder()
                                            .addDependentField(
                                                DependentField.builder()
                                                    .dependentCondition(
                                                        DependentFieldFilter.builder()
                                                            .operator(
                                                                DependentFieldFilter.Operator.EQ
                                                            )
                                                            .rangeEnd("rangeEnd")
                                                            .rangeStart("rangeStart")
                                                            .value("value")
                                                            .addValue("string")
                                                            .build()
                                                    )
                                                    .dependentField(
                                                        PhoneField.builder()
                                                            .dependentFields(listOf())
                                                            .fieldType(PhoneField.FieldType.PHONE)
                                                            .hidden(true)
                                                            .label("label")
                                                            .name("name")
                                                            .objectTypeId("objectTypeId")
                                                            .required(true)
                                                            .useCountryCodeSelect(true)
                                                            .validation(
                                                                PhoneFieldValidation.builder()
                                                                    .maxAllowedDigits(0)
                                                                    .minAllowedDigits(0)
                                                                    .build()
                                                            )
                                                            .defaultValue("defaultValue")
                                                            .description("description")
                                                            .placeholder("placeholder")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .fieldType(EmailField.FieldType.EMAIL)
                                            .hidden(true)
                                            .label("label")
                                            .name("name")
                                            .objectTypeId("objectTypeId")
                                            .required(true)
                                            .validation(
                                                EmailFieldValidation.builder()
                                                    .addBlockedEmailDomain("string")
                                                    .useDefaultBlockList(true)
                                                    .build()
                                            )
                                            .defaultValue("defaultValue")
                                            .description("description")
                                            .placeholder("placeholder")
                                            .build()
                                    )
                                    .groupType(FieldGroup.GroupType.DEFAULT_GROUP)
                                    .richTextType(FieldGroup.RichTextType.TEXT)
                                    .richText("richText")
                                    .build()
                            )
                            .legalConsentOptions(
                                LegalConsentOptionsNone.builder()
                                    .type(LegalConsentOptionsNone.Type.NONE)
                                    .build()
                            )
                            .name("name")
                            .build()
                    )
                    .build()
            )

        val formDefinitionBase = formDefinitionBaseFuture.get()
        formDefinitionBase.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val formServiceAsync = client.marketing().forms()

        val pageFuture = formServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val formServiceAsync = client.marketing().forms()

        val future = formServiceAsync.delete("formId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val formServiceAsync = client.marketing().forms()

        val formDefinitionBaseFuture =
            formServiceAsync.get(FormGetParams.builder().formId("formId").archived(true).build())

        val formDefinitionBase = formDefinitionBaseFuture.get()
        formDefinitionBase.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replace() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val formServiceAsync = client.marketing().forms()

        val formDefinitionBaseFuture =
            formServiceAsync.replace(
                FormReplaceParams.builder()
                    .formId("formId")
                    .hubSpotFormDefinition(
                        HubSpotFormDefinition.builder()
                            .id("id")
                            .archived(true)
                            .configuration(
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
                                        LifecycleStage.builder()
                                            .objectTypeId("objectTypeId")
                                            .value("value")
                                            .build()
                                    )
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .displayOptions(
                                FormDisplayOptions.builder()
                                    .renderRawHtml(true)
                                    .style(
                                        FormStyle.builder()
                                            .backgroundWidth("backgroundWidth")
                                            .fontFamily("fontFamily")
                                            .helpTextColor("helpTextColor")
                                            .helpTextSize("helpTextSize")
                                            .labelTextColor("labelTextColor")
                                            .labelTextSize("labelTextSize")
                                            .legalConsentTextColor("legalConsentTextColor")
                                            .legalConsentTextSize("legalConsentTextSize")
                                            .submitAlignment(FormStyle.SubmitAlignment.LEFT)
                                            .submitColor("submitColor")
                                            .submitFontColor("submitFontColor")
                                            .submitSize("submitSize")
                                            .build()
                                    )
                                    .submitButtonText("submitButtonText")
                                    .theme(FormDisplayOptions.Theme.DEFAULT_STYLE)
                                    .cssClass("cssClass")
                                    .build()
                            )
                            .addFieldGroup(
                                FieldGroup.builder()
                                    .addField(
                                        EmailField.builder()
                                            .addDependentField(
                                                DependentField.builder()
                                                    .dependentCondition(
                                                        DependentFieldFilter.builder()
                                                            .operator(
                                                                DependentFieldFilter.Operator.EQ
                                                            )
                                                            .rangeEnd("rangeEnd")
                                                            .rangeStart("rangeStart")
                                                            .value("value")
                                                            .addValue("string")
                                                            .build()
                                                    )
                                                    .dependentField(
                                                        PhoneField.builder()
                                                            .dependentFields(listOf())
                                                            .fieldType(PhoneField.FieldType.PHONE)
                                                            .hidden(true)
                                                            .label("label")
                                                            .name("name")
                                                            .objectTypeId("objectTypeId")
                                                            .required(true)
                                                            .useCountryCodeSelect(true)
                                                            .validation(
                                                                PhoneFieldValidation.builder()
                                                                    .maxAllowedDigits(0)
                                                                    .minAllowedDigits(0)
                                                                    .build()
                                                            )
                                                            .defaultValue("defaultValue")
                                                            .description("description")
                                                            .placeholder("placeholder")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .fieldType(EmailField.FieldType.EMAIL)
                                            .hidden(true)
                                            .label("label")
                                            .name("name")
                                            .objectTypeId("objectTypeId")
                                            .required(true)
                                            .validation(
                                                EmailFieldValidation.builder()
                                                    .addBlockedEmailDomain("string")
                                                    .useDefaultBlockList(true)
                                                    .build()
                                            )
                                            .defaultValue("defaultValue")
                                            .description("description")
                                            .placeholder("placeholder")
                                            .build()
                                    )
                                    .groupType(FieldGroup.GroupType.DEFAULT_GROUP)
                                    .richTextType(FieldGroup.RichTextType.TEXT)
                                    .richText("richText")
                                    .build()
                            )
                            .formType(HubSpotFormDefinition.FormType.HUBSPOT)
                            .legalConsentOptions(
                                LegalConsentOptionsNone.builder()
                                    .type(LegalConsentOptionsNone.Type.NONE)
                                    .build()
                            )
                            .name("name")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val formDefinitionBase = formDefinitionBaseFuture.get()
        formDefinitionBase.validate()
    }
}
