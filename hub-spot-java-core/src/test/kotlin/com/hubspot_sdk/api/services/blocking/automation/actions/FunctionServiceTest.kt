// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionArchiveByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionCreateOrReplaceParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionGetByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionListParams
import com.hubspot_sdk.api.models.automation.actions.functions.FunctionReadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FunctionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val collectionResponsePublicActionFunctionIdentifierNoPaging =
            functionService.list(
                FunctionListParams.builder().appId(0).definitionId("definitionId").build()
            )

        collectionResponsePublicActionFunctionIdentifierNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val functionService = client.automation().actions().functions()

        functionService.delete(
            FunctionDeleteParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(FunctionDeleteParams.FunctionType.PRE_ACTION_EXECUTION)
                .functionId("functionId")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun archiveByFunctionType() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val functionService = client.automation().actions().functions()

        functionService.archiveByFunctionType(
            FunctionArchiveByFunctionTypeParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .functionType(FunctionArchiveByFunctionTypeParams.FunctionType.PRE_ACTION_EXECUTION)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOrReplace() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val publicActionFunctionIdentifier =
            functionService.createOrReplace(
                FunctionCreateOrReplaceParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionCreateOrReplaceParams.FunctionType.PRE_ACTION_EXECUTION)
                    .functionId("functionId")
                    .body("body")
                    .build()
            )

        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createOrReplaceByFunctionType() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val publicActionFunctionIdentifier =
            functionService.createOrReplaceByFunctionType(
                FunctionCreateOrReplaceByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        FunctionCreateOrReplaceByFunctionTypeParams.FunctionType
                            .PRE_ACTION_EXECUTION
                    )
                    .body("body")
                    .build()
            )

        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByFunctionType() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val publicActionFunction =
            functionService.getByFunctionType(
                FunctionGetByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionGetByFunctionTypeParams.FunctionType.PRE_ACTION_EXECUTION)
                    .build()
            )

        publicActionFunction.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun read() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val functionService = client.automation().actions().functions()

        val publicActionFunction =
            functionService.read(
                FunctionReadParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(FunctionReadParams.FunctionType.PRE_ACTION_EXECUTION)
                    .functionId("functionId")
                    .build()
            )

        publicActionFunction.validate()
    }
}
