// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookBatchUpdateSubscriptionsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookCreateSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookDeleteSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookDeleteSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookGetSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookGetSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookListSubscriptionsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookUpdateSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookUpdateSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.BatchResponseSubscriptionResponse
import com.hubspot_sdk.api.models.appwebhooks.SubscriptionListResponse
import com.hubspot_sdk.api.models.appwebhooks.SubscriptionResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AppWebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppWebhookServiceAsync

    fun batchUpdateSubscriptions(
        appId: Int,
        params: AppWebhookBatchUpdateSubscriptionsParams,
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        batchUpdateSubscriptions(appId, params, RequestOptions.none())

    /** @see batchUpdateSubscriptions */
    fun batchUpdateSubscriptions(
        appId: Int,
        params: AppWebhookBatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        batchUpdateSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see batchUpdateSubscriptions */
    fun batchUpdateSubscriptions(
        params: AppWebhookBatchUpdateSubscriptionsParams
    ): CompletableFuture<BatchResponseSubscriptionResponse> =
        batchUpdateSubscriptions(params, RequestOptions.none())

    /** @see batchUpdateSubscriptions */
    fun batchUpdateSubscriptions(
        params: AppWebhookBatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseSubscriptionResponse>

    fun createSubscription(
        appId: Int,
        params: AppWebhookCreateSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        createSubscription(appId, params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        appId: Int,
        params: AppWebhookCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSubscription */
    fun createSubscription(
        params: AppWebhookCreateSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = createSubscription(params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        params: AppWebhookCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    fun deleteSettings(appId: Int): CompletableFuture<Void?> =
        deleteSettings(appId, AppWebhookDeleteSettingsParams.none())

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: AppWebhookDeleteSettingsParams = AppWebhookDeleteSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: AppWebhookDeleteSettingsParams = AppWebhookDeleteSettingsParams.none(),
    ): CompletableFuture<Void?> = deleteSettings(appId, params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(
        params: AppWebhookDeleteSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteSettings */
    fun deleteSettings(params: AppWebhookDeleteSettingsParams): CompletableFuture<Void?> =
        deleteSettings(params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteSettings(appId, AppWebhookDeleteSettingsParams.none(), requestOptions)

    fun deleteSubscription(
        subscriptionId: Int,
        params: AppWebhookDeleteSubscriptionParams,
    ): CompletableFuture<Void?> = deleteSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        subscriptionId: Int,
        params: AppWebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteSubscription */
    fun deleteSubscription(params: AppWebhookDeleteSubscriptionParams): CompletableFuture<Void?> =
        deleteSubscription(params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        params: AppWebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun getSettings(appId: Int): CompletableFuture<SettingsResponse> =
        getSettings(appId, AppWebhookGetSettingsParams.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: AppWebhookGetSettingsParams = AppWebhookGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        getSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: AppWebhookGetSettingsParams = AppWebhookGetSettingsParams.none(),
    ): CompletableFuture<SettingsResponse> = getSettings(appId, params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        params: AppWebhookGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    /** @see getSettings */
    fun getSettings(params: AppWebhookGetSettingsParams): CompletableFuture<SettingsResponse> =
        getSettings(params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingsResponse> =
        getSettings(appId, AppWebhookGetSettingsParams.none(), requestOptions)

    fun getSubscription(
        subscriptionId: Int,
        params: AppWebhookGetSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        getSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        subscriptionId: Int,
        params: AppWebhookGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        getSubscription(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see getSubscription */
    fun getSubscription(
        params: AppWebhookGetSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = getSubscription(params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        params: AppWebhookGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    fun listSubscriptions(appId: Int): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(appId, AppWebhookListSubscriptionsParams.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: AppWebhookListSubscriptionsParams = AppWebhookListSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: AppWebhookListSubscriptionsParams = AppWebhookListSubscriptionsParams.none(),
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(appId, params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: AppWebhookListSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionListResponse>

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: AppWebhookListSubscriptionsParams
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubscriptionListResponse> =
        listSubscriptions(appId, AppWebhookListSubscriptionsParams.none(), requestOptions)

    fun updateSettings(
        appId: Int,
        params: AppWebhookUpdateSettingsParams,
    ): CompletableFuture<SettingsResponse> = updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: AppWebhookUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse> =
        updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(
        params: AppWebhookUpdateSettingsParams
    ): CompletableFuture<SettingsResponse> = updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: AppWebhookUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingsResponse>

    fun updateSubscription(
        subscriptionId: Int,
        params: AppWebhookUpdateSubscriptionParams,
    ): CompletableFuture<SubscriptionResponse> =
        updateSubscription(subscriptionId, params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        subscriptionId: Int,
        params: AppWebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse> =
        updateSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see updateSubscription */
    fun updateSubscription(
        params: AppWebhookUpdateSubscriptionParams
    ): CompletableFuture<SubscriptionResponse> = updateSubscription(params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        params: AppWebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SubscriptionResponse>

    /**
     * A view of [AppWebhookServiceAsync] that provides access to raw HTTP responses for each
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
        ): AppWebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /app-webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [AppWebhookServiceAsync.batchUpdateSubscriptions].
         */
        fun batchUpdateSubscriptions(
            appId: Int,
            params: AppWebhookBatchUpdateSubscriptionsParams,
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            batchUpdateSubscriptions(appId, params, RequestOptions.none())

        /** @see batchUpdateSubscriptions */
        fun batchUpdateSubscriptions(
            appId: Int,
            params: AppWebhookBatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            batchUpdateSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see batchUpdateSubscriptions */
        fun batchUpdateSubscriptions(
            params: AppWebhookBatchUpdateSubscriptionsParams
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>> =
            batchUpdateSubscriptions(params, RequestOptions.none())

        /** @see batchUpdateSubscriptions */
        fun batchUpdateSubscriptions(
            params: AppWebhookBatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseSubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `post /app-webhooks/2026-03/{appId}/subscriptions`, but
         * is otherwise the same as [AppWebhookServiceAsync.createSubscription].
         */
        fun createSubscription(
            appId: Int,
            params: AppWebhookCreateSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createSubscription(appId, params, RequestOptions.none())

        /** @see createSubscription */
        fun createSubscription(
            appId: Int,
            params: AppWebhookCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSubscription */
        fun createSubscription(
            params: AppWebhookCreateSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            createSubscription(params, RequestOptions.none())

        /** @see createSubscription */
        fun createSubscription(
            params: AppWebhookCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `delete /app-webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [AppWebhookServiceAsync.deleteSettings].
         */
        fun deleteSettings(appId: Int): CompletableFuture<HttpResponse> =
            deleteSettings(appId, AppWebhookDeleteSettingsParams.none())

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            params: AppWebhookDeleteSettingsParams = AppWebhookDeleteSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            params: AppWebhookDeleteSettingsParams = AppWebhookDeleteSettingsParams.none(),
        ): CompletableFuture<HttpResponse> = deleteSettings(appId, params, RequestOptions.none())

        /** @see deleteSettings */
        fun deleteSettings(
            params: AppWebhookDeleteSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteSettings */
        fun deleteSettings(
            params: AppWebhookDeleteSettingsParams
        ): CompletableFuture<HttpResponse> = deleteSettings(params, RequestOptions.none())

        /** @see deleteSettings */
        fun deleteSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteSettings(appId, AppWebhookDeleteSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /app-webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same
         * as [AppWebhookServiceAsync.deleteSubscription].
         */
        fun deleteSubscription(
            subscriptionId: Int,
            params: AppWebhookDeleteSubscriptionParams,
        ): CompletableFuture<HttpResponse> =
            deleteSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteSubscription */
        fun deleteSubscription(
            subscriptionId: Int,
            params: AppWebhookDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteSubscription */
        fun deleteSubscription(
            params: AppWebhookDeleteSubscriptionParams
        ): CompletableFuture<HttpResponse> = deleteSubscription(params, RequestOptions.none())

        /** @see deleteSubscription */
        fun deleteSubscription(
            params: AppWebhookDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /app-webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [AppWebhookServiceAsync.getSettings].
         */
        fun getSettings(appId: Int): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, AppWebhookGetSettingsParams.none())

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            params: AppWebhookGetSettingsParams = AppWebhookGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            params: AppWebhookGetSettingsParams = AppWebhookGetSettingsParams.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, params, RequestOptions.none())

        /** @see getSettings */
        fun getSettings(
            params: AppWebhookGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /** @see getSettings */
        fun getSettings(
            params: AppWebhookGetSettingsParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(params, RequestOptions.none())

        /** @see getSettings */
        fun getSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            getSettings(appId, AppWebhookGetSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /app-webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same
         * as [AppWebhookServiceAsync.getSubscription].
         */
        fun getSubscription(
            subscriptionId: Int,
            params: AppWebhookGetSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscription */
        fun getSubscription(
            subscriptionId: Int,
            params: AppWebhookGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscription */
        fun getSubscription(
            params: AppWebhookGetSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            getSubscription(params, RequestOptions.none())

        /** @see getSubscription */
        fun getSubscription(
            params: AppWebhookGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>

        /**
         * Returns a raw HTTP response for `get /app-webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [AppWebhookServiceAsync.listSubscriptions].
         */
        fun listSubscriptions(
            appId: Int
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(appId, AppWebhookListSubscriptionsParams.none())

        /** @see listSubscriptions */
        fun listSubscriptions(
            appId: Int,
            params: AppWebhookListSubscriptionsParams = AppWebhookListSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listSubscriptions */
        fun listSubscriptions(
            appId: Int,
            params: AppWebhookListSubscriptionsParams = AppWebhookListSubscriptionsParams.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(appId, params, RequestOptions.none())

        /** @see listSubscriptions */
        fun listSubscriptions(
            params: AppWebhookListSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>>

        /** @see listSubscriptions */
        fun listSubscriptions(
            params: AppWebhookListSubscriptionsParams
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(params, RequestOptions.none())

        /** @see listSubscriptions */
        fun listSubscriptions(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubscriptionListResponse>> =
            listSubscriptions(appId, AppWebhookListSubscriptionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /app-webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [AppWebhookServiceAsync.updateSettings].
         */
        fun updateSettings(
            appId: Int,
            params: AppWebhookUpdateSettingsParams,
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            appId: Int,
            params: AppWebhookUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        fun updateSettings(
            params: AppWebhookUpdateSettingsParams
        ): CompletableFuture<HttpResponseFor<SettingsResponse>> =
            updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        fun updateSettings(
            params: AppWebhookUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingsResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /app-webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same
         * as [AppWebhookServiceAsync.updateSubscription].
         */
        fun updateSubscription(
            subscriptionId: Int,
            params: AppWebhookUpdateSubscriptionParams,
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateSubscription(subscriptionId, params, RequestOptions.none())

        /** @see updateSubscription */
        fun updateSubscription(
            subscriptionId: Int,
            params: AppWebhookUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see updateSubscription */
        fun updateSubscription(
            params: AppWebhookUpdateSubscriptionParams
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>> =
            updateSubscription(params, RequestOptions.none())

        /** @see updateSubscription */
        fun updateSubscription(
            params: AppWebhookUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SubscriptionResponse>>
    }
}
