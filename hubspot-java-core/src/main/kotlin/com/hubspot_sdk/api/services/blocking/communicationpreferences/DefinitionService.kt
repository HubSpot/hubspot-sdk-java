// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.communicationpreferences

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.communicationpreferences.ActionResponseWithResultsSubscriptionDefinition
import com.hubspot_sdk.api.models.communicationpreferences.definitions.DefinitionListParams
import java.util.function.Consumer

interface DefinitionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionService

    /** Get a list of subscription status definitions from the account. */
    fun list(): ActionResponseWithResultsSubscriptionDefinition = list(DefinitionListParams.none())

    /** @see list */
    fun list(
        params: DefinitionListParams = DefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionResponseWithResultsSubscriptionDefinition

    /** @see list */
    fun list(
        params: DefinitionListParams = DefinitionListParams.none()
    ): ActionResponseWithResultsSubscriptionDefinition = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ActionResponseWithResultsSubscriptionDefinition =
        list(DefinitionListParams.none(), requestOptions)

    /** A view of [DefinitionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /communication-preferences/2026-03/definitions`, but
         * is otherwise the same as [DefinitionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ActionResponseWithResultsSubscriptionDefinition> =
            list(DefinitionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DefinitionListParams = DefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionResponseWithResultsSubscriptionDefinition>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DefinitionListParams = DefinitionListParams.none()
        ): HttpResponseFor<ActionResponseWithResultsSubscriptionDefinition> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ActionResponseWithResultsSubscriptionDefinition> =
            list(DefinitionListParams.none(), requestOptions)
    }
}
