// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.transactional.smtptokens

import com.hubspot.sdk.core.AutoPagerAsync
import com.hubspot.sdk.core.PageAsync
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.marketing.transactional.CollectionResponseSmtpApiTokenViewForwardPaging
import com.hubspot.sdk.models.marketing.transactional.SmtpApiTokenView
import com.hubspot.sdk.services.async.marketing.transactional.SmtpTokenServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see SmtpTokenServiceAsync.list */
class SmtpTokenListPageAsync
private constructor(
    private val service: SmtpTokenServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SmtpTokenListParams,
    private val response: CollectionResponseSmtpApiTokenViewForwardPaging,
) : PageAsync<SmtpApiTokenView> {

    /**
     * Delegates to [CollectionResponseSmtpApiTokenViewForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseSmtpApiTokenViewForwardPaging.results
     */
    fun results(): List<SmtpApiTokenView> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseSmtpApiTokenViewForwardPaging], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseSmtpApiTokenViewForwardPaging.paging
     */
    fun paging(): Optional<ForwardPaging> = response._paging().getOptional("paging")

    override fun items(): List<SmtpApiTokenView> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SmtpTokenListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<SmtpTokenListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SmtpApiTokenView> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SmtpTokenListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseSmtpApiTokenViewForwardPaging = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SmtpTokenListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SmtpTokenListPageAsync]. */
    class Builder internal constructor() {

        private var service: SmtpTokenServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SmtpTokenListParams? = null
        private var response: CollectionResponseSmtpApiTokenViewForwardPaging? = null

        @JvmSynthetic
        internal fun from(smtpTokenListPageAsync: SmtpTokenListPageAsync) = apply {
            service = smtpTokenListPageAsync.service
            streamHandlerExecutor = smtpTokenListPageAsync.streamHandlerExecutor
            params = smtpTokenListPageAsync.params
            response = smtpTokenListPageAsync.response
        }

        fun service(service: SmtpTokenServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SmtpTokenListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseSmtpApiTokenViewForwardPaging) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SmtpTokenListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SmtpTokenListPageAsync =
            SmtpTokenListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SmtpTokenListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SmtpTokenListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
