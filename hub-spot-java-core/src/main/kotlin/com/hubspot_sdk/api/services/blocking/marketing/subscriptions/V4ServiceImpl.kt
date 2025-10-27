// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.subscriptions

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4.DefinitionService
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4.DefinitionServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4.LinkService
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4.LinkServiceImpl
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4.StatusService
import com.hubspot_sdk.api.services.blocking.marketing.subscriptions.v4.StatusServiceImpl
import java.util.function.Consumer

class V4ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V4Service {

    private val withRawResponse: V4Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val definitions: DefinitionService by lazy { DefinitionServiceImpl(clientOptions) }

    private val links: LinkService by lazy { LinkServiceImpl(clientOptions) }

    private val statuses: StatusService by lazy { StatusServiceImpl(clientOptions) }

    override fun withRawResponse(): V4Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service =
        V4ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun definitions(): DefinitionService = definitions

    override fun links(): LinkService = links

    override fun statuses(): StatusService = statuses

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V4Service.WithRawResponse {

        private val definitions: DefinitionService.WithRawResponse by lazy {
            DefinitionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val links: LinkService.WithRawResponse by lazy {
            LinkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val statuses: StatusService.WithRawResponse by lazy {
            StatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V4Service.WithRawResponse =
            V4ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun definitions(): DefinitionService.WithRawResponse = definitions

        override fun links(): LinkService.WithRawResponse = links

        override fun statuses(): StatusService.WithRawResponse = statuses
    }
}
