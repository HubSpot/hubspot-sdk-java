// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import java.util.Objects

/**
 * Create a new webhook subscription for the specified portal in the HubSpot account. This endpoint
 * allows you to define the subscription details, including the types of events you want to
 * subscribe to. The request body must include the necessary subscription information as defined by
 * the SubscriptionUpsertRequest schema.
 */
class WebhookCreateJournalSubscriptionParams
private constructor(
    private val subscriptionUpsertRequest: SubscriptionUpsertRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionUpsertRequest(): SubscriptionUpsertRequest = subscriptionUpsertRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WebhookCreateJournalSubscriptionParams].
         *
         * The following fields are required:
         * ```java
         * .subscriptionUpsertRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookCreateJournalSubscriptionParams]. */
    class Builder internal constructor() {

        private var subscriptionUpsertRequest: SubscriptionUpsertRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            webhookCreateJournalSubscriptionParams: WebhookCreateJournalSubscriptionParams
        ) = apply {
            subscriptionUpsertRequest =
                webhookCreateJournalSubscriptionParams.subscriptionUpsertRequest
            additionalHeaders = webhookCreateJournalSubscriptionParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                webhookCreateJournalSubscriptionParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionUpsertRequest(subscriptionUpsertRequest: SubscriptionUpsertRequest) =
            apply {
                this.subscriptionUpsertRequest = subscriptionUpsertRequest
            }

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(objectSubscriptionUpsertRequest)`.
         */
        fun subscriptionUpsertRequest(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
        ) =
            subscriptionUpsertRequest(
                SubscriptionUpsertRequest.ofObjectSubscriptionUpsertRequest(
                    objectSubscriptionUpsertRequest
                )
            )

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofAssociation(association)`.
         */
        fun subscriptionUpsertRequest(association: AssociationSubscriptionUpsertRequest) =
            subscriptionUpsertRequest(SubscriptionUpsertRequest.ofAssociation(association))

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent)`.
         */
        fun subscriptionUpsertRequest(
            appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
        ) =
            subscriptionUpsertRequest(
                SubscriptionUpsertRequest.ofAppLifecycleEvent(appLifecycleEvent)
            )

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofListMembership(listMembership)`.
         */
        fun subscriptionUpsertRequest(listMembership: ListMembershipSubscriptionUpsertRequest) =
            subscriptionUpsertRequest(SubscriptionUpsertRequest.ofListMembership(listMembership))

        /**
         * Alias for calling [subscriptionUpsertRequest] with
         * `SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion)`.
         */
        fun subscriptionUpsertRequest(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
        ) =
            subscriptionUpsertRequest(
                SubscriptionUpsertRequest.ofGdprPrivacyDeletion(gdprPrivacyDeletion)
            )

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [WebhookCreateJournalSubscriptionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .subscriptionUpsertRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookCreateJournalSubscriptionParams =
            WebhookCreateJournalSubscriptionParams(
                checkRequired("subscriptionUpsertRequest", subscriptionUpsertRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SubscriptionUpsertRequest = subscriptionUpsertRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookCreateJournalSubscriptionParams &&
            subscriptionUpsertRequest == other.subscriptionUpsertRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(subscriptionUpsertRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WebhookCreateJournalSubscriptionParams{subscriptionUpsertRequest=$subscriptionUpsertRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
