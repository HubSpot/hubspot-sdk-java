// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.communicationpreferences

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.models.communicationpreferences.ActionResponseWithResultsSubscriptionDefinition
import com.hubspot.models.communicationpreferences.definitions.DefinitionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DefinitionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DefinitionServiceAsync

    /** Get a list of subscription status definitions from the account. */
    fun list(): CompletableFuture<ActionResponseWithResultsSubscriptionDefinition> =
        list(DefinitionListParams.none())

    /** @see list */
    fun list(
        params: DefinitionListParams = DefinitionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ActionResponseWithResultsSubscriptionDefinition>

    /** @see list */
    fun list(
        params: DefinitionListParams = DefinitionListParams.none()
    ): CompletableFuture<ActionResponseWithResultsSubscriptionDefinition> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<ActionResponseWithResultsSubscriptionDefinition> =
        list(DefinitionListParams.none(), requestOptions)

    /**
     * A view of [DefinitionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DefinitionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /communication-preferences/2026-03/definitions`, but
         * is otherwise the same as [DefinitionServiceAsync.list].
         */
        fun list():
            CompletableFuture<HttpResponseFor<ActionResponseWithResultsSubscriptionDefinition>> =
            list(DefinitionListParams.none())

        /** @see list */
        fun list(
            params: DefinitionListParams = DefinitionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsSubscriptionDefinition>>

        /** @see list */
        fun list(
            params: DefinitionListParams = DefinitionListParams.none()
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsSubscriptionDefinition>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ActionResponseWithResultsSubscriptionDefinition>> =
            list(DefinitionListParams.none(), requestOptions)
    }
}
